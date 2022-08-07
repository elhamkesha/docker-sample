FROM novinrepo:8082/docker/oracle-jre:17.0.3.1-buster
RUN mkdir -p /myapp
COPY target/docker-sample.jar myapp/docker-sample.jar
ENTRYPOINT ["java","-jar","myapp/docker-sample.jar"]