package com.epicode.progetto.prenotazioni.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.epicode.progetto.prenotazioni.services.UtenteService;

@Component
public class UtenteRunner implements CommandLineRunner{

	@Autowired UtenteService utenteService;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Utente Runna");
		
//		for(int i = 0; i < 10; i++) {
//			utenteService.salvaUtente( utenteService.creaUtente());
//		}
	}
}
