FROM openjdk:17-ea-26-jdk
COPY target/search-0.0.1-SNAPSHOT.jar search.jar
ENTRYPOINT ["java","-Dspring.profiles.active=docker","-jar","/search.jar"]
