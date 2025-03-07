
FROM openjdk:21
ARG JAR_FILE=target/*.jar
COPY target/dagitikSistemler-0.0.1-SNAPSHOT.jar dagitikSistemler.jar
ENTRYPOINT ["java","-jar","dagitikSistemler.jar"]