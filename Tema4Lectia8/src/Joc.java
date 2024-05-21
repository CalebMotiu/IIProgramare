
public class Joc {

	private String team1,team2;
	private int nrShots,golsTeam1,golsTeam2,outs,corners;
	private Ball ball;
	
	
	public Joc(String team1, String team2,int nrShots,Ball ball) {
		this.team1 = team1;
		this.team2 = team2;
		this.golsTeam1 = 0;
		this.golsTeam2 = 0;
		this.outs = 0;
		this.corners = 0;
		this.nrShots = nrShots;
		this.ball = ball;
	}


	public String getTeam1() {
		return team1;
	}


	public void setTeam1(String team1) {
		this.team1 = team1;
	}


	public String getTeam2() {
		return team2;
	}


	public void setTeam2(String team2) {
		this.team2 = team2;
	}

	public String toString() {
		return "	" + team1 + "	" + team2;
	}
	 public void results() {
		 System.out.println("	" + team1 + "	" + team2 + 
				"\ngoluri	" + golsTeam1+ "		" + golsTeam2 +
				"\ncornere	" + corners+
				"\nauturi	" + outs);
	 }
	 
	 public void simuleaza(){
		 int i=0;
		 for (i = 0;i <= nrShots; i++ ) {
			 try {
				 System.out.println(team1+"-"+team2+" : mingea se afla la cordonatele " + 
			 ball.getX() + "," + ball.getY());
				 ball.shoots();
			 }catch(Gol e) {
					if (ball.getX()<=0)
						golsTeam1++;
					else {
						golsTeam2++;
					}
					ball.ballPosition(50, 25);

						
			 }catch(Out e) {
				 outs++;
				 i++;
				 if (ball.getY()<=0)
					 ball.ballPosition(ball.getX(), 0);
				 else
					 ball.ballPosition(ball.getX(), ball.getField().getySize());
					 
			 }catch(Corner e) {
				 corners++;
				 i++;
				 if (ball.getX()<=0) {
					 if (ball.getY()>ball.getField().getySize()/2) {
						 ball.ballPosition(0, ball.getField().getySize());
						 System.out.println(team1+"-"+team2+" : mingea se afla la cordonatele " + 
								 ball.getX() + "," + ball.getY());
						 ball.setX((int)(Math.random()*10));
						 ball.setY((int)-(Math.random()*20));
					 }
					 else {
						 ball.ballPosition(0, 0);
						 System.out.println(team1+"-"+team2+" : mingea se afla la cordonatele " + 
								 ball.getX() + "," + ball.getY());
						 ball.setX((int)(Math.random()*10));
						 ball.setY((int)(Math.random()*20));

					 }  
				 }
				 else {
					 if (ball.getY()>ball.getField().getySize()/2) {
						 ball.ballPosition(ball.getField().getxSize(), ball.getField().getySize());
						 System.out.println(team1+"-"+team2+" : mingea se afla la cordonatele " + 
								 ball.getX() + "," + ball.getY());
						 ball.setY((int)-(Math.random()*20));
						 ball.setX((int)-(Math.random()*10));

					 }
					 else {
						 ball.ballPosition(ball.getField().getxSize(),0);
						 System.out.println(team1+"-"+team2+" : mingea se afla la cordonatele " + 
								 ball.getX() + "," + ball.getY());
						 ball.setY((int)(Math.random()*20));
						 ball.setX((int)-(Math.random()*10));

					 } 
				 }
			}
		 }
	 }
	
	
	
}
