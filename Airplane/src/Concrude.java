
public class Concrude extends TravelingAierplains {

	public Concrude(String planeID, int totalEnginePower, int maxPassengers) {
		super(planeID, totalEnginePower, maxPassengers);		
	}
	public void goSuperSonic() {
		System.out.println(getPlaneID()+" Supersonic mode activated\n");
	}
	public void goSubSonic() {
		System.out.println(getPlaneID()+" Supersonic mode deactivated\n");
	}

}
