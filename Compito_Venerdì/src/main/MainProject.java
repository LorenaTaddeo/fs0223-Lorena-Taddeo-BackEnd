package main;

import java.util.Scanner;

import classes.ElementoMultimediale;
import classes.Immagine;
import classes.RegistrazioneAudio;
import classes.Video;

public class MainProject {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ElementoMultimediale[] arr = new ElementoMultimediale[5];
		
		String Scelta;
		String Titolo;
		int durata;
		int volume;
		int luminosita;
		int numero;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Quale elemento multimediale vuoi produrre?");
			Scelta = sc.nextLine();
			System.out.println("Scelta:" + Scelta);
		
			if(Scelta.equals("Audio")) {
				System.out.print("Qual è il titolo dell'audio?");
				Titolo = sc.nextLine();
				System.out.print("Quanto dura l'audio?");
				durata = sc.nextInt();
				sc.nextLine();
				System.out.print("A quanto metto il volume?");
				volume = sc.nextInt();
				sc.nextLine();
				arr[i] = new RegistrazioneAudio(Titolo, durata, volume);
				
			}else if(Scelta.equals("Video")) {
				System.out.print("Qual è il titolo del video?");
				Titolo = sc.nextLine();
				System.out.print("Quanto dura il video?");
				durata = sc.nextInt();
				sc.nextLine();
				System.out.print("A quanto metto il volume?");
				volume = sc.nextInt();
				sc.nextLine();
				System.out.print("A quanto metto la luminosità?");
				luminosita = sc.nextInt();
				sc.nextLine();
				arr[i] = new Video(Titolo, durata, volume, luminosita);
				
			}else if(Scelta.equals("Immagine")) {
				System.out.print("Qual è il titolo dell'immagine?");
				Titolo = sc.nextLine();
				System.out.print("A quanto metto la luminosità?");
				luminosita = sc.nextInt();
				sc.nextLine();
				arr[i] = new Immagine(Titolo, luminosita);	
			}	
		}
		
		while(true) {
			System.out.print("Scegli l'elemento da eseguire mettendo un numero da 1 a 5, 0 per finire!");
			numero = sc.nextInt();
			sc.nextLine();
			if(numero >= 1 && numero <= 5) {
				
				if(arr[numero - 1] instanceof RegistrazioneAudio) {
					RegistrazioneAudio a = (RegistrazioneAudio) arr[numero - 1];
					a.play();
				}else if(arr[numero - 1] instanceof Video) {
					Video v = (Video) arr[numero - 1];
					v.play();
				}else if(arr[numero - 1] instanceof Immagine) {
					Immagine i = (Immagine) arr[numero - 1];
					i.show();
				}
				
			}else if(numero == 0) {
				System.out.print("Finito");
				break;
			}
		
		}
	}
}
