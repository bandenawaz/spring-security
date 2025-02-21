#Use OpenJDK 25 as base image
FROM openjdk:25-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/spring-boot-devops.jar app.jar

# Expose the application port 8080
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
