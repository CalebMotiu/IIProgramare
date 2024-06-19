package Acte;

public abstract class Acte {

	private static int generateID = 1;
	private int ID;
	
	
	public Acte() {
		ID = generateID;
		generateID++;
	}


	public int getID() {
		return ID;
	}
	
	
	
}
