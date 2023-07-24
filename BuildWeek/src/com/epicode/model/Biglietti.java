package com.epicode.model;

import java.time.LocalDate;

import javax.persistence.Entity;

@Entity
public class Biglietti extends Ticket {

	public Biglietti() {
		super();
	}
	
	public Biglietti(LocalDate emissione, PuntoVendita puntovendita) {
		super(emissione, puntovendita);
	}

	@Override
	public String toString() {
		return "Biglietti " + super.toString();
	}	
	
}
