package org.know.micro.services.currencyconversionmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("org.know.micro.services.currencyconversionmicroservice")
public class CurrencyConversionMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConversionMicroServiceApplication.class, args);
	}

}

