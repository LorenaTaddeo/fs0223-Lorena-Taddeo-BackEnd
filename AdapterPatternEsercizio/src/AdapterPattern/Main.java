package AdapterPattern;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Info i1 = new Info();
		i1.setNome("Giovanni");
		i1.setCognome("Dodo");
		i1.DataDiNascita(LocalDate.of(2000, 02, 20));
		
		Adapter a1 = new Adapter(i1);
		
		UserData u1 = new UserData();
		u1.getData(a1);
		
		System.out.println(u1);
	

	}

}
