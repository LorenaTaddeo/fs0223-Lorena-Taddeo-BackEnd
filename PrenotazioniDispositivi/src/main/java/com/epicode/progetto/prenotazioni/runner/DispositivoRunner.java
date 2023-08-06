package com.epicode.progetto.prenotazioni.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.epicode.progetto.prenotazioni.enumerators.StatoDispositivo;
import com.epicode.progetto.prenotazioni.models.Dispositivo;
import com.epicode.progetto.prenotazioni.models.Laptop;
import com.epicode.progetto.prenotazioni.models.Smartphone;
import com.epicode.progetto.prenotazioni.models.Tablet;
import com.epicode.progetto.prenotazioni.services.DispositivoService;

@Component
public class DispositivoRunner implements CommandLineRunner{

	@Autowired DispositivoService dispositivoService;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Dispositivo Runna");
		
//		for (int i = 0; i < 3; i++) {			
//			dispositivoService.salvaDispositivo(dispositivoService.creaLaptop());
//			dispositivoService.salvaDispositivo( dispositivoService.creaSmartphone() );
//			dispositivoService.salvaDispositivo( dispositivoService.creaTablet() );
//		}
	}
	
	
}
