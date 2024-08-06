FROM openjdk:24-jdk
ADD target/student-app.jar student-app.jar
EXPOSE 8081
ENTRYPOINT java -jar student-app.jar