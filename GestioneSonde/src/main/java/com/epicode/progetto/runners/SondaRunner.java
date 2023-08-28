package com.epicode.progetto.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.epicode.progetto.models.DatiSonda;
import com.epicode.progetto.services.SondaService;

@Component
public class SondaRunner implements ApplicationRunner{
	
	@Autowired SondaService sondaService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		DatiSonda s1 = new DatiSonda("34.394398", "76.3993", 6);
		DatiSonda s2 = new DatiSonda("27.394398", "13.3993", 3);
		DatiSonda s3 = new DatiSonda("90.394398", "63.3993", 5);

		sondaService.createSonda(s1);
		sondaService.createSonda(s2);
		sondaService.createSonda(s3);
		
		
		sondaService.requestSonda(sondaService.getSonda(1l));
		sondaService.requestSonda(sondaService.getSonda(2l));
		sondaService.requestSonda(sondaService.getSonda(3l));
		
	}
	
	
	


}
