FROM java:17

# Make port 8080 available to the world outside this container
EXPOSE 8080

ADD target/HelloWorldApplication.jar HelloWorldApplication.jar

# Run the jar file
ENTRYPOINT ["java","-jar","HelloWorldApplication.jar"]