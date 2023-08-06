package com.epicode.progetto.prenotazioni.models;

import com.epicode.progetto.prenotazioni.enumerators.StatoDispositivo;


import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Dispositivo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	private Utente utente;
	
	@Enumerated(EnumType.STRING)
	private StatoDispositivo statoDispositivo;
	
	public Dispositivo() {
		this.statoDispositivo = StatoDispositivo.DISPONIBILE;
	}
	
	public Dispositivo(Utente utente) {
		this.utente = utente;
		this.statoDispositivo = StatoDispositivo.ASSEGNATO;
	}



	



	
	
	
}
