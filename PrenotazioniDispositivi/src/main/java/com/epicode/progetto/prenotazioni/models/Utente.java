package com.epicode.progetto.prenotazioni.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class Utente {

	@Id
	private String username;
	private String name;
	private String lastname;
	
	@Column(unique = true)
	private String email;
}
