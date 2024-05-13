import java.util.HashSet;

public abstract class SpecificProject extends Project {
	
	private String deadLine;
	public static final int MAX_CAPACITY = 15;
	
	public SpecificProject(String name, int age, String title, String objectiv, long funds,String deadLine) {
		super(name, age, title, objectiv, funds);
		this.deadLine = deadLine;
	}
	
	public SpecificProject(String name, int age, String title, String objectiv, long funds,String deadLine,HashSet<Member> memberList) {
		super(name, age, title, objectiv, funds, memberList);
		this.deadLine = deadLine;
	}

	public String getDeadLine() {
		return deadLine;
	}

	public static int getMaxCapacity() {
		return MAX_CAPACITY;
	}
	
	public boolean addMember(Member m) {
		if (this.getMemberList().size()<MAX_CAPACITY) {
			this.getMemberList().add(m);
			return true;}
		else
			return false;
		
	
	}
	

}
