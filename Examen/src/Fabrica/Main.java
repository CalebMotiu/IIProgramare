package Fabrica;

import Acte.AnagjatulAFostConcediat;
import Persoane.Angajat;
import Persoane.Client;
import Persoane.Manager;
import Persoane.Muncitor;

public class Main {

	public static void main(String[] args) {

		Angajat m1 = new Muncitor(200,4,"Daniel Mihaiescu");
		Angajat m2 = new Muncitor(300,3,"Mihael Mihaiescu");
		Angajat ma1 = new Manager(500,7,"Cornel Bosonescu");
		
		Client c1 = new Client("Maria Monica");
		
		Fabrica f1 = new Fabrica();
		
		f1.addAngajat(m1);
		f1.addAngajat(m2);
		f1.addAngajat(ma1);
		f1.addClient(c1);
		
		f1.afisareAngajati();
		
		f1.afisareClienti();
		
		f1.generareContract(100, c1);
		try {
			f1.eliberareFluturas(m1);
		} catch (AnagjatulAFostConcediat e) {
				System.out.println("Angajatul a fost concediat");
		}
		
		f1.afisareActe();

	}

}
