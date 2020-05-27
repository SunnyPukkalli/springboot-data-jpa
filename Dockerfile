FROM alpine:openjdk-8
COPY target/database.jar database.jar
ENV PROFILE=cloud
EXPOSE 8080
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=$PROFILE","database.jar"]