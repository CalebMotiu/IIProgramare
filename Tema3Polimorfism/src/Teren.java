
public class Teren extends Proprietati {

	private RangulLocatiei rangulLocatiei;
	
	public Teren(Adresa adresa, int suprafata,RangulLocatiei rangulLocatiei) {
		super(adresa, 300, suprafata);
		this.rangulLocatiei = rangulLocatiei;
	}

	@Override
	public int pretulDePlatit() {
		return this.getPret() * this.getSuprafata() / rangulLocatiei.getRang();
	}

	public String afisareFluturas() {
		return "\n	" + getClass().getName() + ":	 " + this.getAdresa().getStrada() + " Nr." + this.getAdresa().getNumar() +
				"\n		 Spurafata: " + this.getSuprafata() + ", Rang: " + rangulLocatiei.getRang() +
				"\n		 Cost:" + this.pretulDePlatit() + "\n";
		
	}
}
