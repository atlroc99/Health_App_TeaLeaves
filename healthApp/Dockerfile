# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 8080 available to the world outside this container
EXPOSE 8080

# The application's jar file
#ARG JAR_FILE= target/healthApp.jar
ADD /target/healthApp.jar healthApp.jar

# Add the application's jar to the container
#ADD ${JAR_FILE} healthApp.jar

# Run the jar file 
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/healthApp.jar"]

#FROM java:8
#EXPOSE 8080
#ADD . target/healthApp.jar healthApp.jar
#ADD gs-spring-boot-docker-0.1.0.jar app.jar
#ENTRYPOINT ["java","-jar","healthApp.jar"]
#
#FROM java:8
#VOLUME /tmp
#ADD . target/healthApp.jar app.jar
#RUN bash -c 'touch /app.jar'
#ENTRYPOINT ["java","-jar","/app.jar"]