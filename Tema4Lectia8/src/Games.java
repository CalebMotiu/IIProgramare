
public class Games {

	public static void main(String[] args) {

		
		Field f1 = new Field(100,50,"Anfield");
		Ball b1 = new Ball(50,25,f1);
		Joc j1 = new Joc("Liverpool","Arsenal",1000,b1);
		
		j1.simuleaza();
		j1.results();
	}

}
