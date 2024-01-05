FROM eclipse-temurin:17
WORKDIR workspace
ARG JAR_FILE=target/catalog-service-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} catalog-service.jar
ENTRYPOINT [ "java", "-jar", "catalog-service.jar" ]