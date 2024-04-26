
public abstract class  Proprietati {

	private Adresa adresa;
	private int pret,suprafata;
	
	public Proprietati(Adresa adresa, int pret,int suprafata) {
		this.adresa = adresa;
		this.pret = pret;
		this.suprafata = suprafata;
	}
	



	public Adresa getAdresa() {
		return adresa;
	}

	public int getPret() {
		return pret;
	}

	public int getSuprafata() {
		return suprafata;
	}

	public abstract int pretulDePlatit();
	
	public String afisareFluturas() {
		return 	"\n	" + getClass().getName() + ": " + adresa.getStrada() + " Nr." + adresa.getNumar() +
				"\n		 Spurafata: " + this.getSuprafata() +
				"\n		 Cost:" + this.pretulDePlatit() + "\n";
	}
}
