# Spring Boot DevTools + Live Reload Issue in IntelliJ Editor
* **
* First Enable Build Automatically `IntelliJ -> Preferences -> Build Execution Deployment -> Compiler -> Build Project Automatically`
* **
* Second use following command `Command + Alt + Shift + /  -> Registry -> compiler.automake.allow.when.app.running`
* **

# Build the Docker Image Tag
* docker build -t kodeship/java-app:1.0 .


# Docker Reference Link
* https://stackoverflow.com/questions/27767264/how-to-dockerize-maven-project-and-how-many-ways-to-accomplish-it
* https://spring.io/guides/gs/spring-boot-docker/
* https://www.youtube.com/watch?v=Nm7m92sZZJA&t=1s


# DOCKER IN PHASES
* Locally - Build Image
* Locally - Push the Build image to Github Package Registry
* Locally - Push the Build image to DockerHub
* GithubAction - Publish Docker Container to Github Package Registry
* GithubAction - Build and Publish Docker Image to DockerHub

# Swagger URL
* http://localhost:8080/v2/api-docs
* http://localhost:8080/swagger-ui/