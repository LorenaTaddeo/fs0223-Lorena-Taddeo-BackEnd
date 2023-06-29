
public class GestioneDipendenti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dipendente x = new Dipendente("matricola:123", Dipartimento.PRODUZIONE);
		x.stampaDatiDipendente();
		Dipendente y = new Dipendente("matricola:456", Dipartimento.PRODUZIONE);
		y.stampaDatiDipendente();
		Dipendente z = new Dipendente("matricola:789", 1200, 35, Livello.IMPIEGATO, Dipartimento.AMMINISTRAZIONE);
		z.stampaDatiDipendente();
		Dipendente bello = new Dipendente("matricola:147", 2000, 45, Livello.DIRIGENTE, Dipartimento.VENDITE);
		bello.stampaDatiDipendente();
		
		x.promuovi();
		x.stampaDatiDipendente();
		z.promuovi();
		z.stampaDatiDipendente();
		
		System.out.println(x.calcolaPaga(x, 5) + y.calcolaPaga(y, 5) + z.calcolaPaga(z, 5) + bello.calcolaPaga(bello, 5));
 
	}

}
