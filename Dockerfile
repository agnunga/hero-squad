# syntax=docker/dockerfile:1
FROM openjdk:11

RUN apt-get update && apt-get install -y unzip
WORKDIR /gradle
RUN curl -L https://services.gradle.org/distributions/gradle-6.5.1-bin.zip -o gradle-6.5.1-bin.zip
RUN unzip gradle-6.5.1-bin.zip
ENV GRADLE_HOME=/gradle/gradle-6.5.1
ENV PATH=$PATH:$GRADLE_HOME/bin
RUN gradle --version

WORKDIR /
CMD gradle build
ADD build/libs/hero-squad-1.0-SNAPSHOT.jar hero-squad.jar
EXPOSE 4567
CMD java -jar hero-squad.jar
