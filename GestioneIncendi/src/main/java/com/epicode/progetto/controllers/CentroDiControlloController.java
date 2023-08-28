package com.epicode.progetto.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CentroDiControlloController {

	@GetMapping("/alarm")
	public void rilevaIncendio(
			@RequestParam Long idsonda, 
			@RequestParam String lat,
			@RequestParam String lon,
			@RequestParam int smokelevel) {
		
		if(smokelevel > 5) {
			System.out.println("Alarm!" + " Sonda:" + idsonda + " Lat: " + lat + " Lon: " + lon + " Smokelevel: " + smokelevel);
		}else{
			System.out.println("Scampato pericolo!" + " Sonda:" + idsonda + " Lat: " + lat + " Lon: " + lon + " Smokelevel: " + smokelevel);
		}
		
	}
	
	
}

