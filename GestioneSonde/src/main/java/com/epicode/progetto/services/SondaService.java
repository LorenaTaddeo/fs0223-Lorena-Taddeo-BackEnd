package com.epicode.progetto.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.epicode.progetto.models.DatiSonda;
import com.epicode.progetto.repository.SondaRepo;

@Service
public class SondaService {

	@Autowired SondaRepo sondaRepo;
	
	public void createSonda(DatiSonda sonda) {
		sondaRepo.save(sonda);
	}
	
	public DatiSonda getSonda(Long id) {
		return sondaRepo.findById(id).get();
	}
	
	public void requestSonda(DatiSonda sonda) {
		RestTemplate restTemplate = new RestTemplate();
		
		String url = "http://localhost:8081/alarm";
		url += "?idsonda=" + sonda.getId();
		url += "&lat=" + sonda.getLatitude();
		url += "&lon=" + sonda.getLongitude();
		url += "&smokelevel=" + sonda.getSmokeLevel();
		
		restTemplate.getForEntity(url, null);
	}
}
