package ru.sberbank.sbervalidator;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.sberbank.sbervalidator.v1.grpc.ValidatorServiceImpl;

import java.io.IOException;

@SpringBootApplication
public class SbervalidatorApplication {

	public static void main(String[] args) throws IOException, InterruptedException {
		Server server = ServerBuilder
				.forPort(8080)
				.addService(new ValidatorServiceImpl()).build();
		server.start();
		server.awaitTermination();
		//SpringApplication.run(SbervalidatorApplication.class, args);
	}

}
