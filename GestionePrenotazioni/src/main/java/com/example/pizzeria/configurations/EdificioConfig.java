package com.example.pizzeria.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.pizzeria.classes.Edificio;

@Configuration
public class EdificioConfig {

	@Bean("generaEdificio")
	@Scope("prototype")
	public Edificio generaEdificio() {
		return new Edificio();
	}
}
