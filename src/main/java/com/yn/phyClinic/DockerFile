# השתמש בתמונת בסיס של OpenJDK 17
FROM openjdk:17-jdk-slim

# קבע את תיקיית העבודה
WORKDIR /app

# העתק את קובץ ה-pom.xml ותלותי Maven
COPY pom.xml .
COPY .mvn/ .mvn/
COPY mvnw .
RUN ./mvnw dependency:go-offline

# העתק את כל הקוד
COPY src ./src

# בנה את ה-JAR
RUN ./mvnw clean install -DskipTests

# חשוף את הפורט (ברירת מחדל של Spring Boot)
EXPOSE 8082

# הרץ את האפליקציה עם פרופיל prod
CMD ["java", "-Dspring.profiles.active=prod", "-jar", "target/phyClinic-0.0.1-SNAPSHOT.jar"]