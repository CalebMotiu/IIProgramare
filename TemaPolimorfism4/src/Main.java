
public class Main {

	public static void main(String[] args) {

		Vagon v1 = new CalatoriA();
		Vagon v2 = new CalatoriB();
		Vagon v3 = new Marfar();
		Vagon v4 = new Marfar();
		
		Tren t1 = new Tren();
		Tren t2 = new Tren();
		Tren t3 = new Tren();

		t1.adaugareVagon(v4);
		t1.adaugareVagon(v2);

		t2.adaugareVagon(v1);
		
		t3.adaugareVagon(v3);
		t3.adaugareVagon(v4);
		
		t1.equals(t3);
		t2.tipuriDeVagoane();
		t3.tipuriDeVagoane();
	}

}
