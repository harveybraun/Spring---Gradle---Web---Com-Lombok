package com.example.Atividade.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Descreve a Classe HelloWorldControler
 *
 * @author Harvey Braun
 * @version 1.0
 * @since 19/04/2020 - 15:00
 */
@RestController
public class HelloWorldControler {

	@GetMapping("/")
	public String index() {
		return "Inicio";
	}
}
