package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {
	
	@GetMapping("sumar/{num1}/{num2}")
	public Integer sumar(@PathVariable Integer num1, @PathVariable Integer num2) {
		return num1 + num2;
	}
	
	@GetMapping("restar/{num1}/{num2}")
	public Integer restar(@PathVariable Integer num1, @PathVariable Integer num2) {
		return num1 - num2;
	}
	
	@GetMapping("multiplicar/{num1}/{num2}")
	public Integer multiplicar(@PathVariable Integer num1, @PathVariable Integer num2) {
		return num1 * num2;
	}
	
	@GetMapping("dividir/{num1}/{num2}")
	public Integer dividir(@PathVariable Integer num1, @PathVariable Integer num2) {
		return num1 / num2;
	}

}
