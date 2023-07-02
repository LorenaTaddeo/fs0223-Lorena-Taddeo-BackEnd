package classes;

import interfaces.Play;
import interfaces.Volume;

public class RegistrazioneAudio extends ElementoMultimediale implements Volume, Play  {
	
	private int durata;
	private int volume;

	public RegistrazioneAudio(String titolo, int durata, int volume) {
		super(titolo);
		this.durata = durata;
		this.volume = volume;
	}
	
	
	@Override
	public void play() {
		
		for(int i = 0; i < durata; i++) {
			System.out.print("Riproduzione Registrazione Audio " + getTitolo());
			
			for(int j = 0; j < volume; j++) {
			System.out.print("!");
			}
			
			System.out.println();
		}	
	}


	@Override
	public void abbassaVolume() {
		if(volume == 0) {
			System.out.print("Volume al minimo");
		}else {
			volume--;
		}
		System.out.println("Abbassa Volume Registrazione Audio");
		
	}


	@Override
	public void alzaVolume() {
		if(volume >= 5) {
			volume = 5;
			System.out.print("Volume al massimo");
		}else {
			volume++;
		}
		System.out.println("Alza Volume Registrazione Audio");
		
	}
	
	

}
