
public class TravelingAierplains extends Airplane {
	
	private int maxPassengers;

	public TravelingAierplains(String planeID, int totalEnginePower, int maxPassengers) {
		super(planeID, totalEnginePower);
		this.maxPassengers = maxPassengers;
	}

	public int getMaxPassengers() {
		return maxPassengers;
	}
	
	
}
