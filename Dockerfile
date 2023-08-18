FROM openjdk:11
WORKDIR /
ADD build/libs/hero-squad-1.0-SNAPSHOT.jar hero-squad-1.0-SNAPSHOT.jar
EXPOSE 4567
CMD java - jar hero-squad-1.0-SNAPSHOT.jar

