package com.epicode.progetto.prenotazioni.models;

import jakarta.persistence.Entity;
import lombok.Builder;

@Entity
@Builder
public class Laptop extends Dispositivo{
	
	public Laptop() {
		super();
	}

	public Laptop(Utente utente) {
		super(utente);
	}

}
