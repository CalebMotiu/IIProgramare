
public abstract class VagonCalatori extends Vagon {
	
	private int passageri;

	public VagonCalatori(int coletePostale,int passageri) {
		super(coletePostale);
		this.passageri = passageri;
	}
	
	public int getPassageri() {
		return passageri;
	}

	public void deschideUsile() {
		System.out.println("Usile s-au deschis automat");
	}
	
	public void inchideUsile() {
		System.out.println("Usile s-au inchis automat");
	}

}
