
public class Main {

	public static void main(String[] args) {
		Contribuabil c1 = new Contribuabil("Ion Popescu","5041928492012");
		Adresa a1 = new Adresa("Strada V Parvan",2);
		Adresa a2 = new Adresa("Strada Lugoj",4);
		Proprietati p1 = new Cladire(a1,20);
		Proprietati p2 = new Teren(a1,10,RangulLocatiei.I);
		Proprietati p3 = new Cladire(a2,25);

		
		
		c1.adaugareProprietate(p1);
		c1.adaugareProprietate(p2);
		c1.adaugareProprietate(p3);


		System.out.println(c1.fluturas());
	}

}
