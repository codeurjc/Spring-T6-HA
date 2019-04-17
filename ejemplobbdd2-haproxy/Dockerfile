FROM maven:3.6.0-jdk-8 as builder
COPY . /src
WORKDIR /src
RUN mvn package -DskipTests

FROM openjdk:8-jre
COPY --from=builder /src/target/ejemplo-haproxy-0.1.0-SNAPSHOT.jar /
CMD ["java", "-jar", "ejemplo-haproxy-0.1.0-SNAPSHOT.jar"] 