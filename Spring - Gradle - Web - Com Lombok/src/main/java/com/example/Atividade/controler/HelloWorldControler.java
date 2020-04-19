package com.example.Atividade.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldControler {

	@GetMapping("/")
	public String index() {
		return "Inicio";
	}
}
