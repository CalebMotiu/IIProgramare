
public class Lei extends ContBancar {

	public Lei(String numarCont, float suma) {
		super(numarCont, suma);
	}

	@Override
	public float getSumaTotala() {
		return this.getSuma();
	}
	
	public void transfer(ContBancar contDestinatie,float suma) {
		this.setSuma(this.getSuma() - suma);
		contDestinatie.setSuma(getSuma() + suma);
	}

}
