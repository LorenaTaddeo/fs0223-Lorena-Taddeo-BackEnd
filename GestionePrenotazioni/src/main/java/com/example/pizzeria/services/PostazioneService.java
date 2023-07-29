package com.example.pizzeria.services;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.pizzeria.classes.Edificio;
import com.example.pizzeria.classes.Postazione;
import com.example.pizzeria.classes.Tipo;
import com.example.pizzeria.classes.Utente;
import com.example.pizzeria.repository.PostazioneRepo;


@Service
public class PostazioneService {

	@Autowired PostazioneRepo postazioneRepo;
	@Autowired @Qualifier("generaPostazione") private ObjectProvider<Postazione> postazioneProvider;
		
		public Postazione creaPostazione(String descrizione, Tipo tipo, Integer numMaxOccupanti, Edificio edificio) {
			return postazioneProvider.getObject().builder()
					.descrizione(descrizione)
					.tipo(tipo)
					.numMaxOccupanti(numMaxOccupanti)
					.edificio(edificio)
					.build();
		}
		
		public void salvaPostazione(Postazione po) {
			postazioneRepo.save(po);
			System.out.println(po);
		}
		
		public Postazione trovaPostazioneId(Long id) {
			return postazioneRepo.findById(id).get();
		}
		
		public List<Postazione> cercaTipoCitta(Tipo tipo, String citta){
			return postazioneRepo.cercaTipoCitta(tipo, citta);
		}
}
