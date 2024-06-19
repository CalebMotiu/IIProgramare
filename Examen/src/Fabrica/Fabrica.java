package Fabrica;

import java.util.ArrayList;
import java.util.HashSet;

import Acte.Acte;
import Acte.AnagjatulAFostConcediat;
import Acte.FluturaseSalariu;
import Acte.Oferta;
import Persoane.Angajat;
import Persoane.Client;

public class Fabrica {

	private HashSet<Angajat> angajati;
	private ArrayList<Client> clienti;
	private ArrayList<Acte>acte;
	
	
	public Fabrica() {
		this.angajati = new HashSet<>();
		this.clienti = new ArrayList<>();
		this.acte = new ArrayList<>();
	}
	
	public boolean addAngajat(Angajat angajat) {
		return angajati.add(angajat);
	}
	public boolean conciedereAngajat(Angajat angajat) {
		return angajati.remove(angajat);
	}
	
	public void afisareAngajati() {
		for (Angajat angajat : angajati)
			System.out.println(angajat);
		System.out.println("\n");
	}
	
	public boolean addClient(Client client) {
		return clienti.add(client);
	}
	
	public void afisareClienti() {
		for (Client client : clienti) {
			System.out.println(client);
		}
		System.out.println("\n");

	}
	
	public boolean generareContract(int valoareaTotala,Client client) {
		Acte a = new Oferta(valoareaTotala, client);
		return acte.add(a);
	}
	
	public boolean eliberareFluturas(Angajat angajat) throws AnagjatulAFostConcediat {
		boolean angajatulExista = false;
		for (Angajat ang : angajati) {
			if (angajat.equals(ang))
				angajatulExista = true;
		}
		if (angajatulExista) {
			Acte a = new FluturaseSalariu(angajat);
			return acte.add(a);
			}
		else
			throw new AnagjatulAFostConcediat();
	}
	
	public void afisareActe() {
		for (Acte act : acte)
			System.out.println(act);
		System.out.println("\n");

	}
	
}
