FROM openjdk:16-jdk-alpine

WORKDIR /home/Schedule
COPY ./build/libs/Schedule-1.jar Schedule-1.jar

EXPOSE 8080

CMD java -jar Schedule-1.jar
