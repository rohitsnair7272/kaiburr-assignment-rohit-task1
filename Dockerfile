# Use OpenJDK base image
FROM openjdk:17
WORKDIR /app

# Copy the built JAR file into the container
COPY target/kaiburr-rohit-0.0.1-SNAPSHOT.jar app.jar

# Expose the application port
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "app.jar"]