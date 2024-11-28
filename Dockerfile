FROM amazoncorretto:17-alpine-jdk

COPY target/aplicacion1-0.0.1-SNAPSHOT.jar aplicacion1.jar

CMD apt-get update -y

ENTRYPOINT [ "java", "-jar", "/aplicacion1.jar" ]