FROM adoptopenjdk:11.0.8_10-jre-hotspot

COPY target/*.jar /app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]

EXPOSE 8080
