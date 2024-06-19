package Acte;

import Persoane.Angajat;

public class FluturaseSalariu extends Acte {

	private Angajat angajat;
	private String valoareaSalariu;

	public FluturaseSalariu(Angajat angajat) {
		this.angajat = angajat;
		this.valoareaSalariu=angajat.afisareSalar();
	}

	public Angajat getAngajat() {
		return angajat;
	}

	public String getValoareaSalariu() {
		return valoareaSalariu;
	}
	
	public String toString() {
		return getClass().getName() + "/" + this.getID() + "/" + this.angajat.getNume();
	}
	
}
