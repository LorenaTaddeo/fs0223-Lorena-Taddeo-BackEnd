package com.epicode.progetto.prenotazioni.services;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.epicode.progetto.prenotazioni.enumerators.StatoDispositivo;
import com.epicode.progetto.prenotazioni.models.Dispositivo;
import com.epicode.progetto.prenotazioni.models.Laptop;
import com.epicode.progetto.prenotazioni.models.Smartphone;
import com.epicode.progetto.prenotazioni.models.Tablet;
import com.epicode.progetto.prenotazioni.models.Utente;
import com.epicode.progetto.prenotazioni.repository.DispositivoRepo;
import com.epicode.progetto.prenotazioni.repository.UtenteRepo;

@Service
public class DispositivoService {

	@Autowired DispositivoRepo dispositivoRepo;
	@Autowired UtenteRepo utenteRepo;
	
	@Autowired @Qualifier("generaLaptop") private ObjectProvider<Laptop> laptopProvider;
	@Autowired @Qualifier("generaSmartphone") private ObjectProvider<Smartphone> smartphoneProvider;
	@Autowired @Qualifier("generaTablet") private ObjectProvider<Tablet> tabletProvider;
	
	public Laptop creaLaptop() {
		return laptopProvider.getObject();
	}
	
	public Smartphone creaSmartphone() {
		return smartphoneProvider.getObject();
	}
	
	public Tablet creaTablet() {
		return tabletProvider.getObject();
	}
	
	public void salvaDispositivo(Dispositivo dispositivo) {
		dispositivoRepo.save(dispositivo);
		System.out.println("Dispositivo Salvato");
	}
	
	public List<Dispositivo> listaDispositivi () {
		return (List<Dispositivo>) dispositivoRepo.findAll();
	}
	
	public Dispositivo trovaDispositivoId(Long id) {
		return dispositivoRepo.findById(id).get();
	}
	
	public void eliminaDispositivo(Long id) {
		dispositivoRepo.deleteById(id);
	}
	
	public void assegnaUtente(String username, Long id) {
		Utente u = utenteRepo.findById(username).get();
		Dispositivo d = dispositivoRepo.findById(id).get();
		
		d.setUtente(u);
		dispositivoRepo.save(d);
		
	}
}
