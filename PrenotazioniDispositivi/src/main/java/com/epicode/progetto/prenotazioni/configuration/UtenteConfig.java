package com.epicode.progetto.prenotazioni.configuration;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.epicode.progetto.prenotazioni.models.Utente;
import com.github.javafaker.Faker;

@Configuration
public class UtenteConfig {
	
	@Bean("fakeUtenteBean")
	@Scope("prototype")
	public Utente fakeUser() {
		Faker faker = new Faker(new Locale("it-IT"));
		Utente u = new Utente().builder()
				.username(faker.name().username())
				.name(faker.name().firstName())
				.lastname(faker.name().lastName())
				.email(faker.internet().emailAddress())
				.build();
		return u;
	}

}
