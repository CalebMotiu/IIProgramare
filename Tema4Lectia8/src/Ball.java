import java.util.Random;

public class Ball {

	private int x,y;
	private Field field;
	private Random randomGenerator;

	public Ball(int x, int y,Field field) {
		this.x = x;
		this.y = y;
		this.field = field;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x += x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y += y;
	}
	
	

	public Field getField() {
		return field;
	}

	public void ballPosition(int bpx,int bpy) {
		this.x = bpx;
		this.y = bpy;
	}
	
	public void shoots() throws Out,Gol,Corner{
		int moveX;
		int moveY;
		if (Math.random()*100>50) {
			 moveX = (int) (Math.random()*10);
			 moveY = (int) (Math.random()*10);
		}
		else
		{
			 moveX = (int) -(Math.random()*10);
			moveY = (int) -(Math.random()*10);
		}
		this.y += moveY;
		this.x += moveX;
		
		if (this.x >= field.getxSize() || this.x <= 0) 
			if (this.y > 20 && this.y < 30)
				throw new Gol();
		
			else if ((this.y == 20 || this.y == 30))
				{this.x -= Math.round(moveX / 2);}
		
			else
				throw new Corner();
		
		else if (this.y >= field.getySize() || this.y <= 0)
			throw new Out();
		
	
	}
}
