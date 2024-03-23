FROM maven:3.9.5-openjdk-21 AS build
COPY . .
RUN maven clean package -DskipTests

COPY --from=build /target/end-to-end-0.0.1-SNAPSHOT.jar end-to-end.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "end-to-end-0.0.1-SNAPSHOT.jar"]

#FROM openjdk:21
#
#COPY target/end-to-end-0.0.1-SNAPSHOT.jar /usr/app/
#
#WORKDIR /usr/app




