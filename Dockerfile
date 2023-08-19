# syntax=docker/dockerfile:1

FROM openjdk:11
WORKDIR /
ADD build/libs/hero-squad-1.0-SNAPSHOT.jar hero-squad.jar
EXPOSE 4567
CMD java -jar hero-squad.jar

