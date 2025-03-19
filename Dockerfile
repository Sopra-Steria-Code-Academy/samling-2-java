FROM openjdk:17-jdk-slim
RUN apt-get update; apt-get install -y curl wget vim libfontconfig1

COPY ./target/*.jar application.jar

COPY ./target/lib /lib

ENTRYPOINT ["java", "-jar", "application.jar", "-XX:ActiveProcessorCount=16"]