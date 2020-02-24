package com.seroter.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BootSimpleK8sAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootSimpleK8sAppApplication.class, args);
	}
	
	@GetMapping("/")
	public String[] GetTickerSymbols() {
		
		String[] symbols = {"VMW", "PVTL"};
		
		return symbols;
	}

}
