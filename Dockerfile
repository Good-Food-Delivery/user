FROM openjdk:17-alpine
WORKDIR /app
COPY user-service-0.0.1-SNAPSHOT.jar /app/user-service-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","user-service-0.0.1-SNAPSHOT.jar"]
