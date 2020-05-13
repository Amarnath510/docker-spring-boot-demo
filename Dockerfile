FROM openjdk:8-jdk

ADD ./hello-greet.jar ./hello-greet.jar

# Port where we are running application
EXPOSE 8181

ENTRYPOINT ["java", "-jar", "hello-greet.jar"]
