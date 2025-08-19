FROM openjdk:18-jdk-slim

ENV JAVA_HOME /usr/local/openjdk-18
ENV PATH $JAVA_HOME/bin:/usr/share/maven/bin:$PATH

RUN apt-get update && \
    apt-get install -y maven && \
    rm -rf /var/lib/apt/lists/*

WORKDIR /app

COPY . .

RUN mvn test

