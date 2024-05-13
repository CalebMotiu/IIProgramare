import java.util.HashSet;

public abstract class Project implements Risky {

	private Manager manager;
	private String title,objectiv;
	protected long funds;
	private HashSet<Member> memberList;
	
	
	public Project(String name,int age, String title, String objectiv, long funds, HashSet<Member> memberList) {
		this.manager = new Manager(age,name);
		this.title = title;
		this.objectiv = objectiv;
		this.funds = funds;
		this.memberList = memberList;
	}
	
	public Project(String name,int age, String title, String objectiv, long funds) {
		this.manager = new Manager(age,name);
		this.title = title;
		this.objectiv = objectiv;
		this.funds = funds;
		this.memberList = new HashSet<Member>();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getObjectiv() {
		return objectiv;
	}

	public void setObjectiv(String objectiv) {
		this.objectiv = objectiv;
	}

	public long getFunds() {
		return funds;
	}

	public void setFunds(long funds) {
		this.funds = funds;
	}

	public Manager getManager() {
		return manager;
	}

	public HashSet<Member> getMemberList() {
		return memberList;
	}	
	
	public abstract boolean addMember(Member m);
	
	public abstract double getRisk();
}
