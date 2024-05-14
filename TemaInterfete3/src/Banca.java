import java.util.HashSet;

public class Banca {

	
	private HashSet<Client> clienti;
	private String codBancar;
	
	public Banca(String codBancar) {
		this.clienti = new HashSet<Client>();
		this.codBancar = codBancar;
	}
	
	
	public HashSet<Client> getClienti() {
		return clienti;
	}
	public void setClienti(HashSet<Client> clienti) {
		this.clienti = clienti;
	}
	public String getCodBancar() {
		return codBancar;
	}
	public void setCodBancar(String codBancar) {
		this.codBancar = codBancar;
	}
	
	public void addClient(Client c) {
		clienti.add(c);
	}
	
	public void afisareClient(String nume) {
		for (Client c : clienti) {
			if (c.getNume().equals(nume)) {
				System.out.println(c.getNume()+" "+ c.getAdresa());
				for (ContBancar cb : c.getConturi())
					System.out.println(cb.getSumaTotala());
			}
				
		}
	}
	
}
