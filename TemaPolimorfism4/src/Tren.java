import java.util.ArrayList;

public class Tren {
	 ArrayList<Vagon> listaVagoane;

	public Tren(ArrayList<Vagon> listaVagoane) {
		this.listaVagoane = listaVagoane;
	}
	
	public Tren() {
		this.listaVagoane = new ArrayList<Vagon>();
	}
	 
	 public boolean adaugareVagon(Vagon v) {
		 if (listaVagoane.size() <= 15)
			 return listaVagoane.add(v);
		 else
			 System.out.println("Prea multe vagoane");
			return false;
	 }
	 
	 public int numarTotalDeColete() {
		 int sum = 0;
		 for (Vagon vagon : listaVagoane){
			 sum += vagon.getColetePostale();
		 }
		 return sum;
	 }
	 
	 public boolean equals(Tren t) {
		 if (this.numarTotalDeColete()==t.numarTotalDeColete())
			 {
			 System.out.println("Trenurile sunt egale");
			 return true;
			 }
		 return false;
	 }
	 public void tipuriDeVagoane() {
		 String result = this.getClass().getName()+":\n	";
		 for (Vagon vagon : listaVagoane){
			 result += vagon.getClass().getName()+"\n	";
		 }
		 System.out.println(result);
		 
	 }
}
