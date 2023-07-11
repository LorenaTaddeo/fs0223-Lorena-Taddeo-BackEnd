package com.epicode.esercizio2;

import java.sql.SQLException;
import java.time.LocalDate;

public class MainProject {

	public static void main(String[] args) {

		try {
			DbConnection db = new DbConnection();
			
			School_Students s = new School_Students("Mario", "Rossi", "m", LocalDate.of(1990, 03, 14), 28, 18, 30);
			
			db.inserisciStudente(s);
			//List<Students> lista = db.leggiUtenti();
			//lista.forEach(ut -> System.out.println(ut));
		}catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

}
