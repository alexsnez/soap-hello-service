# Use OpenJDK 17 as base image
FROM eclipse-temurin:17-jre

# Set working directory
WORKDIR /app

# Copy built JAR from build context
COPY target/soap-hello-service-1.0.0.jar app.jar

# Expose the port (default 8080)
EXPOSE 8080

# Run the app
ENTRYPOINT ["java", "-jar", "app.jar"]
