
public class punctCuloare extends Punct {
	private int r,g,b;
	private String rgb;

	public punctCuloare(int x, int y, int r, int g, int b) {
		super(x, y);
		this.rgb= "rgb " + r +"," + g +","+ b +",";
	}
	
}
