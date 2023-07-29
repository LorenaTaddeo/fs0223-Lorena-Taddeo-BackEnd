package com.example.pizzeria.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.example.pizzeria.classes.Edificio;
import com.example.pizzeria.services.EdificioService;

@Component
@Order(1)
public class EdificioRunner implements CommandLineRunner{

	@Autowired EdificioService edificio;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Run...EdificioRunner");
		Edificio ed1 = edificio.creaEdificio("Delfina", "Via Passetti 2", "Roma");
		Edificio ed2 = edificio.creaEdificio("Scarlet", "Piazza Romanzetti 59", "Firenze");
		Edificio ed3 = edificio.creaEdificio("B-village", "Viale dei Boss", "Milano");
		edificio.salvaEdificio(ed1);
		edificio.salvaEdificio(ed2);
		edificio.salvaEdificio(ed3);
	}

}
