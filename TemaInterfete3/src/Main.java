
public class Main {

	public static void main(String[] args) {

		ContBancar cb1 = new Lei("24351123",2543);
		ContBancar cb2 = new Euro("48256791",10327);
		
		Client c1 = new Client("Caleb","Constantin Brancusi",cb1,cb2);
		
		Banca b = new Banca("203843");
		
		b.addClient(c1);
		
		b.afisareClient("Caleb");

	}

}
