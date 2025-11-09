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

	@GetMapping("/status")
	public String testeo(){
		return "Aqui estara el status de sistema";
	}

	@GetMapping("/data")
	public String about(){
		return "Aqui recibira y procesara datos";
	}

	public static void main(String[] args) {
		SpringApplication.run(ApiRestApplication.class, args);
	}

}
