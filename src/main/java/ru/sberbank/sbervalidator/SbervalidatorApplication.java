package ru.sberbank.sbervalidator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class SbervalidatorApplication {

	public static void main(String[] args) throws IOException, InterruptedException {
		SpringApplication.run(SbervalidatorApplication.class, args);
	}

}
