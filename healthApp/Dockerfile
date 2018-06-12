#FROM java:8
#EXPOSE 8080
#ADD . target/healthApp.jar healthApp.jar
#ADD gs-spring-boot-docker-0.1.0.jar app.jar
#ENTRYPOINT ["java","-jar","healthApp.jar"]

FROM java:8
VOLUME /tmp
ADD . target/healthApp.jar app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-jar","/app.jar"]