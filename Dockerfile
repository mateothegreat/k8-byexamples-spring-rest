FROM openjdk:8-jre-alpine

COPY build/libs/k8-byexamples-spring-rest-0.0.1-SNAPSHOT.jar /application.jar

CMD ["java", "-jar", "/application.jar"]
