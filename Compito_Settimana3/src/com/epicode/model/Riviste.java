package com.epicode.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.epicode.enumerated.Periodicita;

@Entity
public class Riviste extends CatalogoBibliotecario {

	@Enumerated(EnumType.STRING)
	private Periodicita periodicita;

	public Riviste() {
		super();
	}

	public Riviste(String codiceISBN, String titolo, Integer anno, Integer numeroPagine, Periodicita periodicita) {
		super(codiceISBN, titolo, anno, numeroPagine);
		this.periodicita = periodicita;
	}

	public Periodicita getPeriodicita() {
		return periodicita;
	}

	public void setPeriodicita(Periodicita periodicita) {
		this.periodicita = periodicita;
	}

	@Override
	public String toString() {
		return super.toString() + " Riviste [periodicita=" + periodicita + "]";
	}

	
	
	
	
	
}
