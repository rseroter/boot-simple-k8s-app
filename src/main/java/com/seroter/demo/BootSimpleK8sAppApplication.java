package com.seroter.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@SpringBootApplication
public class BootSimpleK8sAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootSimpleK8sAppApplication.class, args);
	}
	
	@GetMapping("/")
	public String LoadHome(Model model) {
		return "home";	
	}
	
	@GetMapping("/about")
	public String LoadAbout(Model model) {
		return "home";	
	}
	
	@GetMapping("/products")
	public String LoadProducts(Model model) {
		return "home";	
	}

}
