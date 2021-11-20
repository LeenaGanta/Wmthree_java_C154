package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = "com")
public class CoffeeVendingMachineRestApiConsumerProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoffeeVendingMachineRestApiConsumerProjectApplication.class, args);
	}
	
	@Bean
	public RestTemplate getTemplate() {
		return new RestTemplate();
	}

}
