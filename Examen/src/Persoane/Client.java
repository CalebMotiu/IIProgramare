package Persoane;

public class Client {

	private String nume;

	public Client(String nume) {
		this.nume = nume;
	}

	public String getNume() {
		return nume;
	}
	
	public boolean equals(Client client) {
		if (this.nume.equals(client.getNume()))
			return true;
		return false;
	}
	
	
}
