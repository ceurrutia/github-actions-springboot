package com.proyectoSpring.api_rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class ApiRestApplication {

	@GetMapping("/welcome")
	public String saludar(){
		return "Hi, baby";
	}

	@GetMapping("/status")
	public String status(){
		return "System UP";
	}

	@GetMapping("/data")
	public List<Product> todosLosProductos(){
		List<Product> productos = new ArrayList<>();
		productos.add(new Product(1, "PC", "Laptop Dell 5486", 29.96, 3, true));
		productos.add(new Product(2, "Mouse", "Mouse inalámbrico Logitech", 10.50, 15, true));
		return productos;
	}

	public static void main(String[] args) {
		SpringApplication.run(ApiRestApplication.class, args);
	}

}
