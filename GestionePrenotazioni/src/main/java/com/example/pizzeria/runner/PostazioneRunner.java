package com.example.pizzeria.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.example.pizzeria.classes.Postazione;
import com.example.pizzeria.classes.Tipo;
import com.example.pizzeria.services.EdificioService;
import com.example.pizzeria.services.PostazioneService;

@Component
@Order(2)
public class PostazioneRunner implements CommandLineRunner{

	@Autowired PostazioneService postazione;
	@Autowired EdificioService edificio;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Run...Postazione");
		Postazione po1 = postazione.creaPostazione("Hotel", Tipo.SALA_RIUNIONI, 30, edificio.trovaEdificioId("Delfina"));
		Postazione po2 = postazione.creaPostazione("Luxury Hotel", Tipo.PRIVATO, 10, edificio.trovaEdificioId("Scarlet"));
		Postazione po3 = postazione.creaPostazione("Villa B", Tipo.OPENSPACE, 250, edificio.trovaEdificioId("B-village"));
		postazione.salvaPostazione(po1);
		postazione.salvaPostazione(po2);
		postazione.salvaPostazione(po3);
	}

}
