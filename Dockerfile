FROM openjdk:17-alpine
WORKDIR /app
COPY build/libs/user-service-0.0.1-SNAPSHOT.jar /app/user-service-0.0.1-SNAPSHOT.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","user-service-0.0.1-SNAPSHOT.jar"]
