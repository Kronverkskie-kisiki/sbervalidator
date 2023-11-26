FROM openjdk:21

ENV GRPC_SERVER_PORT=4242
ENV GRPC_SERVER_IN_PROCESS_NAME=sbervalidator

WORKDIR /app

COPY target/sbervalidator-0.0.1-SNAPSHOT.jar app.jar
EXPOSE $GRPC_SERVER_PORT
CMD ["java", "-jar", "app.jar", "--grpc.server.port=${GRPC_SERVER_PORT}", "--grpc.server.inProcessName=${GRPC_SERVER_IN_PROCESS_NAME}"]