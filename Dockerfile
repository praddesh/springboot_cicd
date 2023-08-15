FROM openjdk:17
EXPOSE 8080
ADD target/springboot-images-new.jar pringboot-images-new.jar
ENTRYPOINT ["java","-jar","/springboot-images-new"]