
public class Member {

	private int age;
	private String name;
	
	public Member(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}
	
	public String getJob() {
		return getClass().getName();
		}
	
	public boolean equals(Member m) {
		if (this.getName()== m.getName()
			&& this.getAge() == m.getAge())
			return true;
		return false;
	}
	
	
}
