
public class Airplane {
	private String planeID;
	private int totalEnginePower;
	
	
	public Airplane(String planeID, int totalEnginePower) {
		this.planeID = planeID;
		this.totalEnginePower = totalEnginePower;
	}


	public String getPlaneID() {
		return planeID;
	}


	public int getTotalEnginePower() {
		return totalEnginePower;
	}
	
	
	public void takeOff() {
		System.out.println(planeID+" Initiating takeoff procedure");
		System.out.println("Starting engines");
		System.out.println("Accelerating down the runway");
		System.out.println("Taking off");
		System.out.println("Retracting gear");
		System.out.println("Takeoff complete\n");
	}
	public void fly() {
		System.out.println(planeID+" Flying\n");
	}
	public void land() {
		System.out.println(planeID+" Initiating landing procedure");
		System.out.println("Enabling airbrakes");
		System.out.println("Lowering gear");
		System.out.println("Contacting runway");
		System.out.println("Decelerating");
		System.out.println("Stopping engines");
		System.out.println("Landing complete\n");
	}
	
	
}
