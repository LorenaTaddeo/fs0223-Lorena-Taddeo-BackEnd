package com.epicode.progetto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.epicode.progetto.models.DatiSonda;

@Repository
public interface SondaRepo extends CrudRepository<DatiSonda, Long>{

}
