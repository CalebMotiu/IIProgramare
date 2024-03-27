
public class Mig extends FighterJets {

	public Mig(String planeID, int totalEnginePower) {
		super(planeID, totalEnginePower);
	}
	
	public void highSpeedGeometry() 
	{
		System.out.println(getPlaneID()+" High speed geometry selected\n");
	}
	
	public void normalGeometry()
	{
		System.out.println(getPlaneID()+" Normal geometry selected\n");

	}
}
