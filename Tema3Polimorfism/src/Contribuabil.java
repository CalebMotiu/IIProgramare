import java.util.ArrayList;

public class Contribuabil {

	private String nume,cnp;
	ArrayList<Proprietati> listaProprietati;

	public Contribuabil(String nume, String cnp) {
		this.nume = nume;
		this.cnp = cnp;
		this.listaProprietati = new ArrayList<Proprietati>();
	}

	public String getNume() {
		return nume;
	}

	public String getCnp() {
		return cnp;
	}
	
	public boolean adaugareProprietate(Proprietati p) {
		listaProprietati.add(p);
		return true;
	}
	
	public int pretulTotal() {
		int sum = 0;
		for (Proprietati proprietate: listaProprietati){
			sum += proprietate.pretulDePlatit();
		}
		return sum;
	}
	
	public String fluturas() {
		String fluturas = getClass().getName()+": "+this.getNume()+ "\n\nProprietati";
		for (Proprietati proprietate: listaProprietati){
			fluturas += proprietate.afisareFluturas();
		}
		fluturas += "\nSuma totala: " + this.pretulTotal();
		return fluturas;
	}
	
}
