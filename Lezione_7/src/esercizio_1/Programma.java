package esercizio_1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Programma {
	
	private static Logger log = LoggerFactory.getLogger(Programma.class);

	public static void main(String[] args) {
		testSet();
		
	}
	
	public static void testSet() {
		int numeroElementi;
		String parola;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserire un numero intero che rappresenti il numero di elementi!");
		numeroElementi = sc.nextInt();
		sc.nextLine();
		
		Set<String> s = new HashSet<String>();
		Set<String> p = new HashSet<String>();
		
		for(int i = 0; i < numeroElementi; i++) {
		System.out.println("Inserisci le parole");
		parola = sc.nextLine();
		
		if(s.contains(parola)) {
			p.add(parola);		
		}else {
			s.add(parola);
		}
		
		}
		
		for (String parole : p) {
			log.info(parole);
		}	
		
		int size = s.size();
		log.info(Integer.toString(size));
		
		for (String parole : s) {
			log.info(parole);
		}		
		
	}

}
