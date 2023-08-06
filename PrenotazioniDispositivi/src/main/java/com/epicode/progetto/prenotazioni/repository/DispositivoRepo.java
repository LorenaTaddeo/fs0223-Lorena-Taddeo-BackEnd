package com.epicode.progetto.prenotazioni.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.epicode.progetto.prenotazioni.models.Dispositivo;

@Repository
public interface DispositivoRepo extends CrudRepository<Dispositivo, Long>{

}
