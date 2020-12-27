FROM openjdk:11.0.9.1-jdk-buster
VOLUME /tmp
WORKDIR /usr/app
COPY src/main/resources/application.properties /usr/app/config/application.properties
COPY target/k8s-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
CMD java -jar app.jar --spring.config.location=/usr/app/config/