package tn.com.biat.account_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;



@EnableEurekaClient
@SpringBootApplication
public class DigitalBankingAccountserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigitalBankingAccountserviceApplication.class, args);
	}

}
