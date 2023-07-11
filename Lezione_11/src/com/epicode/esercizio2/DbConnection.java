package com.epicode.esercizio2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {
	
	String url = "jdbc:postgresql://localhost:5432/";
	String dbName = "jdbctest";
	String user = "postgres";
	String pass = "root";
	Statement st;
	

	public DbConnection() throws SQLException {
		Connection conn = DriverManager.getConnection(url+dbName, user, pass); 		
		st = conn.createStatement();
		createTableSchool_Students();
		System.out.println("DB Connect!!!");
	}
	
	public void createTableSchool_Students() throws SQLException {
		String sql =  " CREATE TABLE IF NOT EXISTS School_Students ("
					+ "		id SERIAL PRIMARY KEY,"
					+ " 	name VARCHAR NOT NULL,"
					+ "		lastname VARCHAR NOT NULL,"
					+ "     gender VARCHAR NOT NULL,"
					+ "     birthdate DATE NOT NULL,"
					+ "		avg INTEGER NOT NULL,"
					+ "		min_vote INTEGER NOT NULL,"
					+ "		max_vote INTEGER NOT NULL"
					+ " );" ;
		st.executeUpdate(sql);
		System.out.println("Table students created!!!");
	}
	
	public void inserisciStudente(School_Students s) throws SQLException {
		String sql = " INSERT INTO School_Students (name, lastname, gender, birthdate, avg, min_vote, max_vote) "
				   + "VALUES ('" + s.getName() 
				   + "', '" + s.getLastname()
				   + "', '" + s.getGender()
				   + "', '" + s.getBirthdate()
				   + "',  " + s.getAvg()
				   + " ,  " + s.getMin_vote()
				   + " ,  " + s.getMax_vote()
				   + " ); ";
		st.executeUpdate(sql);
		System.out.println(s.getName() + " " + s.getLastname() + " created!!!");
	}
}
