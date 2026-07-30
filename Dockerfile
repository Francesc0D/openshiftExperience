FROM eclipse-temurin:21-jre
COPY /mnt/c/K/progettiPriv/openShiftLocal/hourly/hourly/target/hourly-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
