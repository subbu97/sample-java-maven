FROM openjdk:11-jdk

COPY target/micro-service1.jar micro-service1.jar

ENV PORT=8080
EXPOSE 8080

CMD [ "java", "-jar", "micro-service1.jar"]
