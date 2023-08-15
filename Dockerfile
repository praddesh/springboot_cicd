FROM openjdk:17
EXPOSE 8080
ADD target/springboot-images-new.jar ringboot-images-new.jar
ENTRYPOINT ["java","-jar","/springboot-images-new.jar"]
