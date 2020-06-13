package com.pru.api.proposalpolicy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.pru.api")
public class ProposalpolicyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProposalpolicyApplication.class, args);
	}

}
