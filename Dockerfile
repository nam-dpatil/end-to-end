FROM openjdk:21

COPY target/end-to-end-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "end-to-end-0.0.1-SNAPSHOT.jar"]
