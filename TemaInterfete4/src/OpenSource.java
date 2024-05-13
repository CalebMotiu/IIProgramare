import java.util.HashSet;

public class OpenSource extends Project{

	private String mailingList;

	public OpenSource(String name, int age, String title, String objectiv, long funds, HashSet<Member> memberList,
			String mailingList) {
		super(name, age, title, objectiv, funds, memberList);
		this.mailingList = mailingList;
	}

	public OpenSource(String name, int age, String title, String objectiv, long funds,
			String mailingList) {
		super(name, age, title, objectiv, funds);
		this.mailingList = mailingList;
	}

	public String getMailingList() {
		return mailingList;
	}

	@Override
	public double getRisk() {
		return this.getMemberList().size() / funds;
	}

	@Override
	public boolean addMember(Member m) {
		this.getMemberList().add(m);
		return true;
	}
}
