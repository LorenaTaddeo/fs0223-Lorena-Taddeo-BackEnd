package com.example.pizzeria.services;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.pizzeria.classes.Edificio;
import com.example.pizzeria.repository.EdificioRepo;

@Service
public class EdificioService {

	@Autowired EdificioRepo edificioRepo;
	@Autowired @Qualifier("generaEdificio") private ObjectProvider<Edificio> edificioProvider;
		
		public Edificio creaEdificio(String nome, String indirizzo, String citta) {
			return edificioProvider.getObject().builder()
					.nome(nome)
					.indirizzo(indirizzo)
					.citta(citta)
					.build();
		}
		
		public void salvaEdificio(Edificio e) {
			edificioRepo.save(e);
			System.out.println(e);
		}
		
		public Edificio trovaEdificioId(String nome) {
			return edificioRepo.findById(nome).get();
		}
}
