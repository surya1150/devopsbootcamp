FROM tomcat:8

EXPOSE 8082
EXPOSE 8080

ARG JAR_FILE=/target/*.jar

#COPY ${WAR_FILE} /usr/local/tomcat/webapps/app.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
#CMD ["catalina.sh", "run"]  
