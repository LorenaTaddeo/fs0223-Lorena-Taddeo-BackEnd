package com.example.pizzeria.classes;

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
public class Edificio {

	@Id
	private String nome;
	
	private String indirizzo;
	private String citta;
}
