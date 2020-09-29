node('gcp-instance') {    
    stage('SCM Checkout') { 
        // Get some code from a GitHub repository
        checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/surya1150/devopsbootcamp.git']]])
        
    }
    stage('Build') {
        // Run the maven build
        sh 'mvn clean install'
    }
    stage('unit testing') {
        junit '**/target/surefire-reports/TEST-*.xml'
        archiveArtifacts 'target/*.jar'
    }
    stage('docker image build') {
        sh 'sudo docker build -t spring-app-jenkins .'
        withCredentials([usernamePassword(credentialsId: 'docker_login', passwordVariable: 'password', usernameVariable: 'login')]) {
        sh "sudo docker login -u ${login} -p ${password}"
}
    }
	stage('push image into docker registry') {		
		sh 'sudo docker tag spring-app-jenkins:latest surya1150/bootcamp:spring-app-jenkins'
        sh 'sudo docker push surya1150/bootcamp:spring-app-jenkins'
	}
	stage('pull image') {
		sh 'sudo docker pull surya1150/bootcamp:spring-app-jenkins'
   }
   stage('Create container in GCP INSTANCE'){
		sh 'sudo docker run -d --name=spring-app-jenkins -p 8083:8080 surya1150/bootcamp:spring-app-jenkins'
   }
    
}
