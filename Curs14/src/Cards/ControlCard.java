package Cards;

public abstract class ControlCard extends Card {

	private char[] controlNumber = new char[3];

	

	public ControlCard(String numeUtilizator, char[] numbers, char[] controlNumber) {
		super(numeUtilizator, numbers);
		this.controlNumber = controlNumber;
	}



	public char[] getControlNumber() {
		return controlNumber;
	}
	
	
}
