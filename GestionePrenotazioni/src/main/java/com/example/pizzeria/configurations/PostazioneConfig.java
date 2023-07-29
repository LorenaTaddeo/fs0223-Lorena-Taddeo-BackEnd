package com.example.pizzeria.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.pizzeria.classes.Edificio;
import com.example.pizzeria.classes.Postazione;

@Configuration
public class PostazioneConfig {

	@Bean("generaPostazione")
	@Scope("prototype")
	public Postazione generaPostazione() {
		return new Postazione();
	}
	
}
