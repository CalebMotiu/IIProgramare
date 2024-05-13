import java.util.ArrayList;

public class InvestmentCompany {

	private static ArrayList<Project> projects = new ArrayList<Project>();
	
	public static void addProject(Project p) {
		projects.add(p);
	}
	
	public static void getBestInvestment() {
		double bestRisk = projects.get(0).getRisk();
		String nameOfBestInvestment = projects.get(0).getTitle();
		for (Project p : projects) {
			if (p.getRisk() < bestRisk) {
				bestRisk = p.getRisk();
				nameOfBestInvestment = p.getTitle();
			}
		}
		System.out.println("The best project to invest in is" + nameOfBestInvestment);
		
		
	}
	
	public static void main(String[] args) {

		Member m1 = new Member(20,"Luana");
		Member m2 = new Member(23,"Noemi");
		Member m3 = new Member(22,"Caleb");
		Member m4 = new Member(21,"Greti");

		Project p1 = new Comercial("Daniel",40,"Termoplast","Lucru de calitate",10029,"10/12/2025");
		p1.addMember(m1);
		p1.addMember(m3);

		Project p2 = new Militare("Adi",45,"Avioane","Ii spargem pe toti",11202,"02/03/2025","MAahdfajrf");
		p2.addMember(m4);
		p2.addMember(m2);
		
		Project p3 = new OpenSource("Simona",38,"Conta","Salvam banii",2000,"simona@conta.ro");
		p3.addMember(m1);
		p3.addMember(m2);
		p3.addMember(m3);
		p3.addMember(m4);
		
		addProject(p1);
		addProject(p2);
		addProject(p3);

		getBestInvestment();
	}

}
