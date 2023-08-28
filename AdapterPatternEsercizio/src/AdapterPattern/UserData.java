package AdapterPattern;

public class UserData implements DataSource{

	private String nomeCompleto; 
	private int eta; 

	public void getData(DataSource ds) { 
	nomeCompleto = ds. getNomeCompleto (); 
	eta = ds.getEta(); 
	}
	

	@Override
	public String getNomeCompleto() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getEta() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public String toString() {
		return "UserData [nomeCompleto=" + nomeCompleto + ", eta=" + eta + "]";
	}
	
	
}
