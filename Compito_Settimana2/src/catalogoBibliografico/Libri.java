package catalogoBibliografico;

public class Libri extends CatalogoBibliotecario {
	
	private String autore;
	private String genere;
	
	public Libri(String codiceISBN, String titolo, Integer anno, Integer numeroPagine, String autore, String genere) {
		super(codiceISBN, titolo, anno, numeroPagine);
		this.autore = autore;
		this.genere = genere;
		}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	@Override
	public String toString() {
		return "Libri [autore=" + autore + ", genere=" + genere + "]";
	}

	public static String toStringFile(Libri libro) {
		return Libri.class.getSimpleName()  
				+ "@" + libro.getCodiceISBN()
				+ "@" + libro.getTitolo()
				+ "@" + libro.getAnno()
				+ "@" + libro.getNumeroPagine()
				+ "@" + libro.getAutore()
				+ "@" + libro.getGenere();
	}

	public static Libri fromStringFile(String txtFile) {
		String[] split = txtFile.split("@");
		
		return new Libri(split[1], split[2], Integer.valueOf(split[3]), Integer.valueOf(split[4]), split[5], split[6]);
	}
	
	

	
	
	


}
