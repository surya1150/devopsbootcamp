FROM tomcat:8

EXPOSE 8082
EXPOSE 8080

ARG WAR_FILE=/target/*.war

#COPY ${WAR_FILE} /usr/local/tomcat/webapps/app.war 
COPY ${WAR_FILE} app.war
ENTRYPOINT ["java", "-jar", "app.war"]
#CMD ["catalina.sh", "run"]  
