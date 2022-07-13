#syntax=docker/dockerfile:1

FROM openjdk:11

RUN git clone https://github.com/diegovini/strategy-pattern.git app

WORKDIR /app/src

RUN javac design/patterns/strategy/main/Application.java
ENTRYPOINT ["java", "design/patterns/strategy/main/Application"]
