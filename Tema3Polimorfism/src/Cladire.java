
public class Cladire extends Proprietati {

	

	public Cladire(Adresa adresa, int suprafata) {
		super(adresa, 500, suprafata);
	}

	public int pretulDePlatit() {
		return this.getPret() * this.getSuprafata();
	}

}
