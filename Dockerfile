FROM eclipse-temurin:17-jdk
LABEL MAINTAINER="ejindu.com"
COPY target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
