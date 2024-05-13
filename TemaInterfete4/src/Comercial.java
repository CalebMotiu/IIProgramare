import java.util.HashSet;

public class Comercial extends SpecificProject{

	private long marketingFunds;
	private int nrEchipe;
	
	public Comercial(String name, int age, String title, String objectiv, long funds, String deadLine) {
		super(name, age, title, objectiv, funds, deadLine);
		this.marketingFunds = funds / 2 ;
		this.nrEchipe=1;
	}
	public Comercial(String name, int age, String title, String objectiv, long funds,String deadLine,HashSet<Member> memberList,int nrEchipe) {
		super(name, age, title, objectiv, funds, deadLine,memberList);
		this.marketingFunds = funds / 2 ;
		this.nrEchipe=1;
		if (nrEchipe<=this.getMemberList().size());{
			this.nrEchipe = nrEchipe;}
	}
	
	public long getMarketingList() {
		return marketingFunds;
	}
	
	public void setFunds(long funds) {
		this.funds = funds;
		this.marketingFunds = funds / 2;
	}
	
	public int getNrEchipe() {
		return nrEchipe;
	}
	public void setNrEchipe(int nrEchipe) {
		if (nrEchipe < this.getMemberList().size())
		this.nrEchipe = nrEchipe;
	}
	
	@Override
	public double getRisk() {
		return nrEchipe * 3 / this.getMemberList().size() / funds;
	}

	

}
