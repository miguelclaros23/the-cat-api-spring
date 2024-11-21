# Start with a base image containing Java runtime
FROM openjdk:17-jdk-slim

# Add a volume pointing to /tmp
VOLUME /tmp

# Copy the build JAR file
COPY /target/*.jar app.jar

# Set the command to run the application
CMD ["java", "-jar", "app.jar"]