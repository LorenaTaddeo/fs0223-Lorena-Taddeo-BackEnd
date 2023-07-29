package com.example.pizzeria.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.example.pizzeria.classes.Utente;
import com.example.pizzeria.services.UtenteService;

@Component
@Order(3)
public class UtenteRunner implements CommandLineRunner{

	@Autowired UtenteService utente;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Run...Utente");
		Utente u1 = utente.creaUtente("Beppe", "Giuseppe", "g.verdi@example.com");
		Utente u2 = utente.creaUtente("Melina", "Carmelina", "c.melina@example.com");
		Utente u3 = utente.creaUtente("Tonio", "Antonio", "a.giallo@example.com");

		utente.salvaUtente(u1);
		utente.salvaUtente(u2);
		utente.salvaUtente(u3);
	}
}
