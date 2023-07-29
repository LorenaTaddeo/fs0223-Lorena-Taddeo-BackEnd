package com.example.pizzeria.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.pizzeria.classes.Utente;

@Configuration
public class UtenteConfig {

	@Bean("generaUtente")
	@Scope("prototype")
	public Utente generaUtente() {
		return new Utente();
	}
	
}
