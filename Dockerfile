FROM adoptopenjdk:11-jre
COPY target/Project2021-1.0-SNAPSHOT.jar /demo.jar
ENTRYPOINT ['java', '-jar','/demo.jar']

# Step : Test and package
FROM maven:3.6.3
WORKDIR /build
COPY pom.xml .
RUN mvn dependency:go-offline

COPY src/ /build/src/
RUN mvn package

