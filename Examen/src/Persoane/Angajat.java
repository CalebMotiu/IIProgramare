package Persoane;

public abstract class Angajat {

	private int valoareaNumerica,anVechime;
	private String nume;
	
	
	public Angajat(int valoareaNumerica, int anVechime, String nume) {
		this.valoareaNumerica = valoareaNumerica;
		this.anVechime = anVechime;
		this.nume = nume;
	}
	
	public String afisareSalar() {
		double sum = valoareaNumerica + valoareaNumerica * 0.1 * anVechime;
		String stringSum = String.valueOf(sum);
		return stringSum;
	}
	
	
	
	public int getValoareaNumerica() {
		return valoareaNumerica;
	}

	public String getNume() {
		return nume;
	}

	public String toString() {
		return nume + " (" + getClass().getName() + ")";
	}
	
	
	public boolean equals(Angajat angajat) {
		if (this.nume.equals(angajat.getNume())&& this.valoareaNumerica==angajat.getValoareaNumerica())
			return true;
		return false;
	}
}
