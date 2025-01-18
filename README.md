# Project name
### Hero Squad

## Project description.
An app that allows you to recruit a well-balanced team of superhero of choice. 

## Author information
#### Omosh

## Website URL
https://hero-squad-vlbf.onrender.com/add-hero

## Setup instructions
Pull the code from Github repository : https://github.com/agnunga/hero-squad.git

## Prerequisites
Docker and Gradle should be installed

### Steps
#### Gradle build
```bash
gradle build
```

#### Build a docker image
```bash
docker build -t hero-squad .
```

#### run docker image
```bash
docker run -dp 127.0.0.1:4567:4567 hero-squad
```

#### Stop the running image
```bash
docker ps
docker stop <Containcer NAME>
```

## Technologies used
Java, Spark Framework, Handlebars, Javascript, CSS

## Contact information.
#### yolojeya@gmail.com

## Copyright
#### (c) omosh
