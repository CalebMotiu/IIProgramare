package Acte;

import Persoane.Client;

public class Oferta extends Acte {

	private int valoareaTotala;
	private Client client;
	
	
	public Oferta(int valoareaTotala, Client client) {
		this.valoareaTotala = valoareaTotala;
		this.client = client;
	}


	public int getValoareaTotala() {
		return valoareaTotala;
	}


	public Client getClient() {
		return client;
	}
	
	public String toString() {
		return getClass().getName() + "/" + this.getID() + "/" + this.client.getNume();
	}
}
