package com.epicode.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.epicode.enumerated.Periodicita;

@Entity
public class Abbonamenti extends Ticket{
	
	@Enumerated(EnumType.STRING)
	private Periodicita periodicita;

	public Abbonamenti() {
		super();
	}
	
	public Abbonamenti(LocalDate emissione, PuntoVendita puntovendita, Periodicita periodicita) {
		super(emissione, puntovendita);
		this.periodicita = periodicita;
	}

	@Override
	public String toString() {
		return "Abbonamenti [periodicita=" + periodicita + " " + super.toString() + "]";
	}

		

}
