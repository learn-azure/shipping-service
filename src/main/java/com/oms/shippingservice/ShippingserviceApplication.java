package com.oms.shippingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ShippingserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShippingserviceApplication.class, args);
	}
	
	@GetMapping("/status")
	public String getShippingStatus() {
		return "Shipping Status:: Delivered";
	}

}
