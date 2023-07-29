package com.example.pizzeria.services;

import java.time.LocalDate;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.pizzeria.classes.Postazione;
import com.example.pizzeria.classes.Prenotazione;
import com.example.pizzeria.classes.Utente;
import com.example.pizzeria.repository.PrenotazioneRepo;


@Service
public class PrenotazioneService {

	@Autowired PrenotazioneRepo prenotazioneRepo;
	@Autowired @Qualifier("generaPrenotazione") private ObjectProvider<Prenotazione> prenotazioneProvider;
		
		public Prenotazione creaPrenotazione(Utente utente, Postazione postazione, LocalDate gPrenotazione) {
			return prenotazioneProvider.getObject().builder()
					.utente(utente)
					.postazione(postazione)
					.GPrenotazione(gPrenotazione)
					.build();
		}
		
		public void salvaPrenotazione(Prenotazione p) {
			if(prenotazioneRepo.cercaGPrePost(p.getGPrenotazione(), p.getPostazione()) == null) {
                if(prenotazioneRepo.cercaUtenteData(p.getUtente(), p.getGPrenotazione()) == null) {
                    prenotazioneRepo.save(p);
                    System.out.println(p);
                }else {
                    System.out.println("Non puoi prenotare lo stesso giorno in due posti diversi!");
                }
            }else {
                System.out.println("Prenotazione impossibile, postazione occupata!");
            }
		}
}
