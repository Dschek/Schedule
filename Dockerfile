FROM openjdk:16-jdk-alpine

WORKDIR /home/Schedule
COPY ./build/libs/schedule-1.jar schedule.jar

EXPOSE 8080

CMD java -jar schedule.jar
