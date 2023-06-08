FROM openjdk:18
WORKDIR /app
COPY src /app/src
RUN javac -cp src src/Main.java
CMD ["java", "-cp", "src", "Main"]