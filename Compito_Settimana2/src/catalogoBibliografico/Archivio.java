package catalogoBibliografico;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;

public class Archivio {

	static Map<String, CatalogoBibliotecario> archivio = new HashMap<String, CatalogoBibliotecario>();

	
	public static void main(String[] args) {

		
		Libri l1 = new Libri("1", "Il signore degli anelli", 1955, 300, "Tolkien", "Romanzo");
		Libri l2 = new Libri("2", "Topolino", 1985, 100, "Walt Disney", "Fumetto");
		Libri l3 = new Libri("3", "L'alchimista", 1988, 250, "Paulo Coelho", "Romanzo");
		Libri l4 = new Libri("4", "Delitto e castigo", 1866, 110, "Fëdor Dostoevskij", "Romanzo-Giallo");
		Riviste r1 = new Riviste("5", "Vogue", 2020, 40, Periodicita.MENSILE);
		Riviste r2 = new Riviste("6", "Focus", 2021, 30, Periodicita.SETTIMANALE);
		Riviste r3 = new Riviste("7", "Vanity Fair", 2022, 20, Periodicita.SEMESTRALE);
		Riviste r4 = new Riviste("8", "Internazionale", 2023, 50, Periodicita.MENSILE);
		
		esercizioAggiunta(l1);
		esercizioAggiunta(l2);
		esercizioAggiunta(l3);
		esercizioAggiunta(l4);
		esercizioAggiunta(r1);
		esercizioAggiunta(r2);
		esercizioAggiunta(r3);
		esercizioAggiunta(r4);
		System.out.println(esercizioISBN("3"));
		System.out.println(esercizioAnnoPubblicazione(2020));
		System.out.println(esercizioAutore("Walt Disney"));
		
		try {
			salvaSuFile();
			caricaFile();
		} catch (IOException e) {
			System.out.println("Errore");
			e.printStackTrace();
		}
		
		
		esercizioRimozione("4");
		
		
	}
	
	public static void esercizioAggiunta(CatalogoBibliotecario elemento) {
		archivio.put(elemento.getCodiceISBN(), elemento);
		System.out.println("Elemento aggiunto in archivio " + elemento.getCodiceISBN() + " " + elemento.getTitolo());	
	}
	
	public static void esercizioRimozione(String CodiceISBN) {
		CatalogoBibliotecario rimuovoElemento = archivio.remove(CodiceISBN);
		System.out.println("Elemento rimosso dall'archivio " + rimuovoElemento.getCodiceISBN() + " " + rimuovoElemento.getTitolo());
	}
	
	public static CatalogoBibliotecario esercizioISBN(String CodiceISBN) {
		return archivio.get(CodiceISBN);
		
	}
	
	public static List<CatalogoBibliotecario> esercizioAnnoPubblicazione(Integer anno) {
		return archivio
				.values()
				.stream()
				.filter(l -> anno.equals(l.getAnno()))
				.collect(Collectors.toList());
				
		
	}
	public static List<Libri> esercizioAutore(String autore) {
		return archivio
				.values()
				.stream()
				.filter(el -> el instanceof Libri)
				.map(el -> (Libri) el)
				.filter(el -> autore.equals(el.getAutore()))
				.collect(Collectors.toList());
		
	}
	
	
	public static void salvaSuFile() throws IOException {
		File documento = new File("documenti/CatalogoBibliotecario.txt");
		String txt = "";
		
		for (CatalogoBibliotecario cb : archivio.values()) {
			if(txt.length() != 0 ) {
				txt += "#";
			}
			if(cb instanceof Libri) {
				txt += Libri.toStringFile((Libri) cb);
			}else if(cb instanceof Riviste) {
				txt += Riviste.toStringFile((Riviste) cb);
			}	
		}
		
		FileUtils.writeStringToFile(documento, txt, "UTF-8");
		System.out.println("Salvato su file " + documento.getPath());
		
		
			
		
	}
	
	public static void caricaFile() throws IOException {
		archivio.clear();
		File documento = new File("documenti/CatalogoBibliotecario.txt");

		String testoLetto = FileUtils.readFileToString(documento, "UTF-8");
		
		//String[] arr = testoLetto.split("#");
		List<String> arr = Arrays.asList(testoLetto.split("#"));
		
		for (String testoSplit : arr) {
			CatalogoBibliotecario cb = null;
			System.out.println(testoSplit);
			if(testoSplit.startsWith(Libri.class.getSimpleName())) {
				cb = Libri.fromStringFile(testoSplit);
			}else if(testoSplit.startsWith(Riviste.class.getSimpleName())) {
				cb = Riviste.fromStringFile(testoSplit);
			}
			archivio.put(cb.getCodiceISBN(), cb);
		}
		System.out.println("File caricato" + documento.getPath());
		

	}
	

}
