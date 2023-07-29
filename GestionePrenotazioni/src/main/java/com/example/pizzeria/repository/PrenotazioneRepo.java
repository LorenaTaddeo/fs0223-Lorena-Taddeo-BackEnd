package com.example.pizzeria.repository;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.pizzeria.classes.Postazione;
import com.example.pizzeria.classes.Prenotazione;
import com.example.pizzeria.classes.Utente;

public interface PrenotazioneRepo extends CrudRepository<Prenotazione, Long>{

	@Query("SELECT p FROM Prenotazione p WHERE p.GPrenotazione = :GPrenotazione AND p.postazione = :postazione")
    public Prenotazione cercaGPrePost(LocalDate GPrenotazione, Postazione postazione);

    @Query("SELECT p FROM Prenotazione p WHERE p.utente = :utente AND p.GPrenotazione = :GPrenotazione")
    public Prenotazione cercaUtenteData(Utente utente, LocalDate GPrenotazione);
}
