package com.example.Atividade.controler;

import com.example.Atividade.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * Descreve a Classe ClientControler
 *
 * @author Harvey Braun
 * @version 1.0
 * @since 19/04/2020 - 15:00
 */
@RestController
public class ClientControler {

	@GetMapping("/cliente")
	public Client getClient() {
		Client client = new Client();
		client.setName("Antonio Paulo Silveira");
		return client;
	}

	@GetMapping("/clientes")
	public ArrayList<Client> getClients() {
		ArrayList<Client> clients = new ArrayList<>();
		clients.add(new Client("Jairo Garcia Lopes"));
		clients.add(new Client("Paulo Cesar Almeida"));
		return clients;
	}

}
