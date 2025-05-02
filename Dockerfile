FROM openjdk:17-jdk-alpine
LABEL authors="archietrackroo"

COPY target/vcms.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]