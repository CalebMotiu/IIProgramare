
public class AirplaneBase {

	public static void main(String[] args) {

		Airplane boeing1 = new Boeing("bg14324",500,250);
		Airplane concrude1 = new Concrude("cc22324",750,400);
		Airplane mig1 = new Mig("mg13175",2000);
		Airplane tomCat1 = new TomCat("tm67493",2500);

		Boeing actionBoeing1 = (Boeing)boeing1;
		Concrude actionConcrude1 = (Concrude)concrude1;
		Mig actionMig1 = (Mig)mig1;
		TomCat actionTomCat1 = (TomCat)tomCat1;

		actionBoeing1.takeOff();
		actionBoeing1.fly();
		actionBoeing1.land();
		

		actionConcrude1.takeOff();
		actionConcrude1.fly();
		actionConcrude1.land();
		actionConcrude1.goSuperSonic();
		actionConcrude1.goSubSonic();
		
		actionMig1.takeOff();
		actionMig1.fly();
		actionMig1.land();
		actionMig1.launchMissile();
		actionMig1.highSpeedGeometry();
		actionMig1.normalGeometry();
		
		actionTomCat1.takeOff();
		actionTomCat1.fly();
		actionTomCat1.land();
		actionTomCat1.launchMissile();
		actionTomCat1.refuel();
	}

}
