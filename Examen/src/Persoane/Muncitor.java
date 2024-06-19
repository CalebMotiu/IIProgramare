package Persoane;

import java.util.ArrayList;

public class Muncitor extends Angajat {

	private ArrayList<String> responsabilitati;

	public Muncitor(int valoareaNumerica, int anVechime, String nume) {
		super(valoareaNumerica, anVechime, nume);
		this.responsabilitati = new ArrayList<>();
	}
	
	public boolean addResponsabilitati(String responsabilitate) {
		return responsabilitati.add(responsabilitate);
	}
	
	public boolean responsabilitateTerminata(String responsabilitate) {
		return responsabilitati.remove(responsabilitate);
	}
}
