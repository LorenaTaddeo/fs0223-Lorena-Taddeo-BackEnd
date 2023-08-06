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
		String name = faker.name().firstName();
		String surname = faker.name().lastName();
		Utente u = new Utente().builder()
				.username((name + "." + surname).toLowerCase())
				.name(name)
				.lastname(surname)
				.email((name + "." + surname + "@email.com").toLowerCase())
				.build();
		return u;
	}

}
