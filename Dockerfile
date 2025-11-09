FROM eclipse-temurin:17-jdk-alpine
EXPOSE 8080
ADD target/api-rest-new.jar api-rest-new.jar
ENTRYPOINT ["java", "-jar", "/api-rest-new.jar"]

