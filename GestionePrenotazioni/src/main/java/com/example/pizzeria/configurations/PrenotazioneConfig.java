package com.example.pizzeria.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.pizzeria.classes.Prenotazione;

@Configuration
public class PrenotazioneConfig {
	
	@Bean("generaPrenotazione")
	@Scope("prototype")
	public Prenotazione generaPrenotazione() {
		return new Prenotazione();
	}

}
