
public class Dipendente {
	 //attributi
	public static double stipendioBase = 1000; 
	private String matricola;
	private double stipendio;
	private double importoOrarioStraordinario;
	private Livello livello;
	private Dipartimento dipartimento;
	
	public static void main(String[] args) {
		
	}
	
	public Dipendente (String matricola, Dipartimento dipartimento){
		this.matricola = matricola;
		this.dipartimento = dipartimento;
		this.stipendio = stipendioBase;
		this.importoOrarioStraordinario = 30;
		this.livello = Livello.OPERAIO;
	}
	
	public Dipendente (String matricola, double stipendio, double importoOrarioStraordinario, Livello livello, Dipartimento dipartimento) {
		this.matricola = matricola;
		this.stipendio = stipendio;
		this.importoOrarioStraordinario = importoOrarioStraordinario;
		this.livello = livello;
		this.dipartimento = dipartimento;
	};
	
	//metodi get
	public String getmatricola() {
		return this.matricola;
	}
	
	public double getstipendio() {
		return this.stipendio;
	}
	
	public double getimportoOrarioStraordinario() {
		return this.importoOrarioStraordinario;
	}
	
	public Livello getlivello() {
		return this.livello;
	}
	
	public Dipartimento getdipartimento() {
		return this.dipartimento;
	}
	
	//metodi set
	public double setimportoOrarioStraordinario() {
		return this.importoOrarioStraordinario;
	}
	
	public Dipartimento setdipartimento() {
		return this.dipartimento;
	}
	
	public void stampaDatiDipendente() {
		System.out.println(this.matricola);
		System.out.println(this.stipendio);
		System.out.println(this.importoOrarioStraordinario);
		System.out.println(this.livello);
		System.out.println(this.dipartimento);
	}
	
	public Livello promuovi() {
		if(livello == Livello.OPERAIO) {
			livello = Livello.IMPIEGATO;
			this.stipendio = stipendioBase * 1.2;
		}else if(livello == Livello.IMPIEGATO) {
			livello = Livello.QUADRO;
			this.stipendio = stipendioBase * 1.5;
		}else if(livello == Livello.QUADRO) {
			livello = Livello.DIRIGENTE;
			this.stipendio = stipendioBase * 2;
		}else {
			System.out.println("Errore!");
		}
		return this.livello;
	}
	
	public static double calcolaPaga(Dipendente d1) {
		return d1.stipendio;
		
	}
	
	public static double calcolaPaga(Dipendente d2, int OreStraordinarie){
		return d2.stipendio + OreStraordinarie;
		
	}
	
	

}
