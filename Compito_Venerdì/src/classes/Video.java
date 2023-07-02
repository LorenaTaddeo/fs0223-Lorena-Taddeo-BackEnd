package classes;

import interfaces.Luminosita;
import interfaces.Play;
import interfaces.Volume;

public class Video extends ElementoMultimediale implements Volume, Luminosita, Play {
	
	private int volume;
	private int luminosita;
	private int durata;

	public Video(String titolo, int durata, int volume, int luminosita) {
		super(titolo);
		this.durata = durata;
		this.volume = volume;
		this.luminosita = luminosita;
	}

	@Override
	public void play() {
		
		for(int i = 0; i < durata; i++) {
			System.out.print("Riproduzione Video " + getTitolo());
			
			for (int j = 0; j < volume; j++){
				System.out.print("!");
			}
			
			for(int z = 0; z < luminosita; z++) {
				System.out.print("*");
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
		System.out.println("Abbassa Volume Riproduzione Video");
		
	}

	@Override
	public void alzaVolume() {
		if(volume >= 5) {
			volume = 5;
			System.out.print("Volume al massimo");
		}else {
			volume++;
		}
	    System.out.println("Alza Volume Riproduzione Video");
		
	}

	@Override
	public void aumentaLuminosita() {
		if(luminosita >= 5) {
			luminosita = 5;
			System.out.print("Luminosità al massimo");
		}else {
			luminosita++;
		}
		
		System.out.println("Aumenta Luminosità Riproduzione Video");
		
		
	}

	@Override
	public void diminuisciLuminosita() {
		if(luminosita == 0) {
			System.out.print("Luminosità al minimo");
		}else {
			luminosita--;
		}
		System.out.println("Diminuisci Luminosità Riproduzione Video");
		
	}

}
