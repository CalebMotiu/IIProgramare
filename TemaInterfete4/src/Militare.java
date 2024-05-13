import java.util.HashSet;

public class Militare extends SpecificProject{

	private String password;
	
	public Militare(String name, int age, String title, String objectiv, long funds, String deadLine,
			HashSet<Member> memberList,String password) {
		super(name, age, title, objectiv, funds, deadLine, memberList);
		this.password=password;
	}

	public Militare(String name, int age, String title, String objectiv, long funds, String deadLine, String password) {
		super(name, age, title, objectiv, funds, deadLine);
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public double getRisk() {
		return this.getMemberList().size() / password.length() / funds;
	}
	
	
	

}
