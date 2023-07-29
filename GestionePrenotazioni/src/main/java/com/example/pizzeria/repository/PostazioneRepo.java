package com.example.pizzeria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.pizzeria.classes.Postazione;
import com.example.pizzeria.classes.Tipo;

public interface PostazioneRepo extends CrudRepository<Postazione,Long>{

	@Query("SELECT po FROM Postazione po WHERE po.tipo = :tipo AND po.edificio.citta = :citta")
    public List <Postazione> cercaTipoCitta(Tipo tipo, String citta);
	
}
