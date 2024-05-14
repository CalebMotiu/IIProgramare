
public class Person {

	private String nume;
	private Transmitter transmitter;
	
	public Person(String nume) {
		this.nume = nume;
		this.transmitter = null;
	}

	public String getNume() {
		return nume;
	}

	public void setTransmitter(Transmitter transmitter) {
		this.transmitter = transmitter;
	}
	
	public Transmitter getTransmitter() {
		return transmitter;
	}

	public void send(Person p,String s) {
		Message m = new Message(this,p,s);
		transmitter.store(m);
	}
	
	
}
