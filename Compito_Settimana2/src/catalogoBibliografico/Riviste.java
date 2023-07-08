package catalogoBibliografico;


public class Riviste extends CatalogoBibliotecario {
	

	private Periodicita periodicita;
	
	public Riviste(String codiceISBN, String titolo, int anno, int numeroPagine, Periodicita periodicita) {
		super(codiceISBN, titolo, anno, numeroPagine);
		this.periodicita = periodicita;
	}

	public Periodicita getPeriodicita() {
		return periodicita;
	}

	public void setPeriodicita(Periodicita periodicita) {
		this.periodicita = periodicita;
	}

	@Override
	public String toString() {
		return "Riviste [periodicita=" + periodicita + "]";
	}

	public static String toStringFile(Riviste rivista) {
		return Riviste.class.getSimpleName()  // Serve per identificare il tipo di elemento
				+ "@" + rivista.getCodiceISBN()
				+ "@" + rivista.getTitolo()
				+ "@" + rivista.getAnno()
				+ "@" + rivista.getNumeroPagine()
				+ "@" + rivista.getPeriodicita();
	}
	
	public static Riviste fromStringFile(String txtFile) {
		String[] split = txtFile.split("@");
		return new Riviste(split[1], split[2], Integer.valueOf(split[3]), Integer.valueOf(split[4]), Periodicita.valueOf(split[5]));
	}
	


}
