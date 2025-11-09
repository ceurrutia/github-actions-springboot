package com.proyectoSpring.api_rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ApiRestApplication {

	@GetMapping("/welcome")
	public String saludar(){
		return "Hi, baby baby";
	}

	@GetMapping("/testeo")
	public String testeo(){
		return "Este es mi endpoint de testeo";
	}

	@GetMapping("/about")
	public String about(){
		return "Este es el endpoint about this page";
	}

	public static void main(String[] args) {
		SpringApplication.run(ApiRestApplication.class, args);
	}

}
