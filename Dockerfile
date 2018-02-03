FROM openjdk:8
ADD ./build/libs/rabbitmq-producer-service-0.0.1.jar ./rabbitmq-producer-service-0.0.1.jar
EXPOSE 39992
ENTRYPOINT ["java","-jar","rabbitmq-producer-service-0.0.1.jar"]