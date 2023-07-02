package classes;

import interfaces.Luminosita;

public class Immagine extends ElementoMultimediale implements Luminosita {
	
	private int luminosita;
	

	public Immagine(String titolo, int luminosita) {
		super(titolo);
		this.luminosita = luminosita;
	}
	
	public void show() {
		System.out.print("Mostra Immagine " + getTitolo());
		
		for(int i = 0; i < luminosita; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

	@Override
	public void aumentaLuminosita() {
		if(luminosita >= 5) {
			luminosita = 5;
			System.out.print("Luminosità al massimo");
		}else {
			luminosita++;
		}
		System.out.println("Aumenta Luminosità Immagine");
		
	}

	@Override
	public void diminuisciLuminosita() {
		if(luminosita == 0) {
			System.out.print("Luminosità al minimo");
		}else {
			luminosita--;
		}
		System.out.println("Diminuisci Luminosità Immagine");
		
	};


}
