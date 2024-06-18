package Cards;

public abstract class Card {

	private String numeUtilizator;
	private char[] numbers = new char[16];
	
	
	public Card(String numeUtilizator, char[] numbers) {
		this.numeUtilizator = numeUtilizator.substring(0, 14);
		this.numbers = numbers;
	}


	public String getNumeUtilizator() {
		return numeUtilizator;
	}


	public char[] getNumbers() {
		return numbers;
	}
	
	public String toString() {
		return this.numeUtilizator + "\n" + numbers + "\n";
	}
	
}
