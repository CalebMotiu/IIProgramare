
public class TomCat extends FighterJets {

	public TomCat(String planeID, int totalEnginePower) {
		super(planeID, totalEnginePower);
	}
	
	public void refuel()
	{
		System.out.println(getPlaneID()+" Initiating refueling procedure");
		System.out.println("Locating refueller");
		System.out.println("Catching up");
		System.out.println("Refueling");
		System.out.println("Refueling complete\n");

	}
}
