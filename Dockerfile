FROM openjdk:11
EXPOSE 8080
ADD target/spring-image.jar spring-image.jar
ENTRYPOINT ["java","-jar","/spring-image.jar"]

