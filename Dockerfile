FROM openjdk:8
EXPOSE 9000
AND target/spring-security-jwt-example.jar
ENTRYPOINT ["java", "-jar","/spring-security-jwt-example.jar"]