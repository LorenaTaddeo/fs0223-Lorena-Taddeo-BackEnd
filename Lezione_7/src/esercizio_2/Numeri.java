package esercizio_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Numeri {

	public static void main(String[] args) {
		
		listaBoo(liste(listaOrdinata()), false);
		

	}
	
	public static List<Integer> listaOrdinata() {
		int n;
		
		List<Integer> l = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Metti numero intero");
		n = sc.nextInt();
		sc.nextLine();
		
		Random r = new Random();
		
		for(int i = 0; i < n; i++) {
			l.add(r.nextInt(101));
		}
		System.out.println(l.toString());
		return l;
	}
	
	public static List<Integer> liste(List<Integer> l) {
		
		List<Integer> l1 = new ArrayList<Integer>();
		
		l1.addAll(l);
		
		Collections.reverse(l);
		
		l1.addAll(l);
		
		System.out.println(l1.toString());
		return l1;
		
		
		
	}

	public static void listaBoo(List<Integer> l2, boolean bool) {
		
		int i = 1;
		for (Integer integer : l2) {
			
			if(i % 2 == 0 && bool) {
				System.out.print(integer + " ");	
			}else if(i % 2 != 0 && !bool) {
				System.out.print(integer + " ");	
			}
			i++;
			
		}
	}
}

