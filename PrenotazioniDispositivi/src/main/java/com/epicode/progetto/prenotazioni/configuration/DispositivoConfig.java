package com.epicode.progetto.prenotazioni.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.epicode.progetto.prenotazioni.models.Laptop;
import com.epicode.progetto.prenotazioni.models.Smartphone;
import com.epicode.progetto.prenotazioni.models.Tablet;

@Configuration
public class DispositivoConfig {

	@Bean("generaLaptop")
	@Scope("prototype")
	public Laptop generaLaptop() {
		return new Laptop();
	}
	
	@Bean("generaSmartphone")
	@Scope("prototype")
	public Smartphone generaSmartphone() {
		return new Smartphone();
	}
	
	@Bean("generaTablet")
	@Scope("prototype")
	public Tablet generaTablet() {
		return new Tablet();
	}
}
