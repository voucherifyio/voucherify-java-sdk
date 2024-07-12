FROM openjdk:18-jdk-slim

ENV JAVA_HOME /usr/local/openjdk-18
ENV PATH $JAVA_HOME/bin:/usr/share/maven/bin:$PATH

RUN apt-get update && \
    apt-get install -y maven && \
    rm -rf /var/lib/apt/lists/*

WORKDIR /app

COPY .env .
COPY pom.xml .
COPY ./src ./src
COPY ./__tests__ ./__tests__

RUN mvn clean install

RUN mvn install:install-file -Dfile=./target/voucherify-java-sdk-12.0.0.jar -DgroupId=local -DartifactId=voucherify-java-sdk -Dversion=12.0.0 -Dpackaging=jar

RUN mvn -f ./__tests__ clean install

CMD mvn -f ./__tests__ test

