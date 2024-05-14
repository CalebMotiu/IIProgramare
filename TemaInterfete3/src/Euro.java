
public class Euro extends ContBancar {

	private final float SCHIMB_VALUTAR = 36000,DOBANDA = (float) 0.3;
	private final int LIMITA_MAXIMA = 500,LIMITA_MINIMA = 0;
	
	public Euro(String numarCont, float suma) {
		super(numarCont, suma);
	}

	@Override
	public float getSumaTotala() {
		return this.getSuma() * SCHIMB_VALUTAR;
	}
	
	
	public float getDobanda() {
		if (this.getSuma() > LIMITA_MAXIMA || this.getSuma() < LIMITA_MINIMA)
			return DOBANDA;
		return 0;
	}

}
