#
# Build stage
#
FROM maven:3.6.3-openjdk-11-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app

# RUN mvn -f /home/app/pom.xml clean package
RUN --mount=type=cache,target=/root/.m2  mvn -f /home/app/pom.xml clean package -Dmaven.test.skip

#
# Package stage
#
FROM openjdk:11-jre-slim
COPY --from=build /home/app/target/*.jar /usr/local/lib/app.jar

ENV PORT=8080
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/local/lib/app.jar"]


