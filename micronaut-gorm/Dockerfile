FROM openjdk:8u171-alpine3.7
RUN apk --no-cache add curl
COPY target/micronaut-gorm*.jar micronaut-gorm.jar
CMD java ${JAVA_OPTS} -jar micronaut-gorm.jar