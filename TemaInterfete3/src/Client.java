import java.util.ArrayList;

public class Client {

	private String nume,adresa;
	private ArrayList<ContBancar> conturi;
	private final int MaxBancCounts = 5;
	
	
	public Client(String nume, String adresa,ContBancar c1,ContBancar c2,ContBancar c3,ContBancar c4,
			ContBancar c5) {
		this.nume = nume;
		this.adresa = adresa;
		this.conturi = new ArrayList<ContBancar>(MaxBancCounts);
		this.conturi.add(c1);
		this.conturi.add(c2);
		this.conturi.add(c3);
		this.conturi.add(c4);
		this.conturi.add(c5);

	}
	public Client(String nume, String adresa,ContBancar c1,ContBancar c2,ContBancar c3,ContBancar c4) {
		this.nume = nume;
		this.adresa = adresa;
		this.conturi = new ArrayList<ContBancar>(MaxBancCounts);
		this.conturi.add(c1);
		this.conturi.add(c2);
		this.conturi.add(c3);
		this.conturi.add(c4);
	}
	public Client(String nume, String adresa,ContBancar c1,ContBancar c2,ContBancar c3) {
		this.nume = nume;
		this.adresa = adresa;
		this.conturi = new ArrayList<ContBancar>(MaxBancCounts);
		this.conturi.add(c1);
		this.conturi.add(c2);
		this.conturi.add(c3);
	}
	public Client(String nume, String adresa,ContBancar c1,ContBancar c2) {
		this.nume = nume;
		this.adresa = adresa;
		this.conturi = new ArrayList<ContBancar>(MaxBancCounts);
		this.conturi.add(c1);
		this.conturi.add(c2);
	}
	public Client(String nume, String adresa,ContBancar c1) {
		this.nume = nume;
		this.adresa = adresa;
		this.conturi = new ArrayList<ContBancar>(MaxBancCounts);
		this.conturi.add(c1);
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	public ArrayList<ContBancar> getConturi() {
		return conturi;
	}
	public void setConturi(ArrayList<ContBancar> conturi) {
		this.conturi = conturi;
	}
	
	public boolean addContBancar(ContBancar c) {
		if (conturi.size()<MaxBancCounts)
		{
			conturi.add(c);
			return true;
		}
		return false;
	}
	
	
	
	
}

