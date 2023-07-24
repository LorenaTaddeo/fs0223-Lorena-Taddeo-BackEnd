package com.epicode.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Ticket {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codice_univoco")
	private Long CodiceUnivoco;
	
	private LocalDate Emissione;
	
	@Column(name = "punto_vendita")
	@ManyToOne
	private PuntoVendita puntovendita;
	
	public Ticket() {
		super();
	}
	
	public Ticket(LocalDate emissione, PuntoVendita puntovendita) {
		super();
		Emissione = emissione;
		this.puntovendita = puntovendita;
	}

	public Long getCodiceUnivoco() {
		return CodiceUnivoco;
	}

	public void setCodiceUnivoco(Long codiceUnivoco) {
		CodiceUnivoco = codiceUnivoco;
	}

	public LocalDate getEmissione() {
		return Emissione;
	}

	public void setEmissione(LocalDate emissione) {
		Emissione = emissione;
	}

	public PuntoVendita getPuntovendita() {
		return puntovendita;
	}

	public void setPuntovendita(PuntoVendita puntovendita) {
		this.puntovendita = puntovendita;
	}

	@Override
	public String toString() {
		return "Ticket [CodiceUnivoco=" + CodiceUnivoco + ", Emissione=" + Emissione + ", puntovendita=" + puntovendita
				+ "]";
	}
	
	

	
}
