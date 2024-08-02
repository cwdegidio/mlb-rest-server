FROM bellsoft/liberica-openjdk-alpine:17.0.8

WORKDIR /mlb-rest-server
COPY /target/mlb-rest-server-0.0.1-SNAPSHOT.jar mlb-rest-server.jar

CMD ["java", "-jar", "./mlb-rest-server.jar"]
