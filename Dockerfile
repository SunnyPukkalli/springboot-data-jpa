FROM openjdk:8-jre-alpine
COPY target/database.jar database.jar
EXPOSE 8080
ENTRYPOINT exec java -jar database.jar --spring.profiles.active=$PROFILE
