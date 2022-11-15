FROM openjdk:18-ea-11-jdk-alpine3.15
ARG JAR_FILE=build/libs/spring-boot-0.1.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

# docker run -p 8080:8080 spring-boot