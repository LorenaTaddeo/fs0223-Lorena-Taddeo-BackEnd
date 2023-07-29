package com.example.pizzeria.runner;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.example.pizzeria.classes.Prenotazione;
import com.example.pizzeria.services.PostazioneService;
import com.example.pizzeria.services.PrenotazioneService;
import com.example.pizzeria.services.UtenteService;

@Component
@Order(4)
public class PrenotazioneRunner implements CommandLineRunner{

	@Autowired PrenotazioneService prenotazione;
	@Autowired UtenteService utente;
	@Autowired PostazioneService postazione;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Run...Prenotazione");
		
		//System.out.println(utente.trovaUtenteId("Beppe"));
		//System.out.println(postazione.trovaPostazioneId(1l));
		
		Prenotazione p1 = prenotazione.creaPrenotazione(utente.trovaUtenteId("Beppe"), postazione.trovaPostazioneId(1l), LocalDate.of(2020, 1, 21));
		Prenotazione p2 = prenotazione.creaPrenotazione(utente.trovaUtenteId("Melina"), postazione.trovaPostazioneId(2l), LocalDate.of(2023, 5, 15));
		Prenotazione p3 = prenotazione.creaPrenotazione(utente.trovaUtenteId("Tonio"), postazione.trovaPostazioneId(3l), LocalDate.of(2022, 2, 22));
		Prenotazione p4 = prenotazione.creaPrenotazione(utente.trovaUtenteId("Tonio"), postazione.trovaPostazioneId(1l), LocalDate.of(2020, 1, 21));
		Prenotazione p5 = prenotazione.creaPrenotazione(utente.trovaUtenteId("Beppe"), postazione.trovaPostazioneId(2l), LocalDate.of(2020, 1, 21));
		Prenotazione p6 = prenotazione.creaPrenotazione(utente.trovaUtenteId("Melina"), postazione.trovaPostazioneId(3l), LocalDate.of(2022, 2, 22));
		prenotazione.salvaPrenotazione(p1);
		prenotazione.salvaPrenotazione(p2);
		prenotazione.salvaPrenotazione(p3);
		prenotazione.salvaPrenotazione(p4);
		prenotazione.salvaPrenotazione(p5);
		prenotazione.salvaPrenotazione(p6);
	}

}
