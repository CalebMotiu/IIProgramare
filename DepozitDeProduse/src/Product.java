
public class Product {
	private long code;
	private String name;
	private double price;
	private int quantity;
	
	
	public Product(long code, String name, double price) {
		this.code = code;
		this.name = name;
		this.price = price;
		this.quantity = 1;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public long getCode() {
		return code;
	}


	public String getName() {
		return name;
	}


	public double getPrice() {
		return price;
	}
	
	
	public void setPrice(double price) {
		this.price = price;
	}


	public boolean equal(Product p) 
	{
		if (getCode() == (p.getCode()) && getName().contentEquals(p.getName()))
			return true;
		return false;
	}
	
	public String toString()
	{
		return "Code: " + getCode() + ", Name: " + getName() + "\nPrice: " + getPrice() + ", Quantity: " + getQuantity()+"\n";
	}
	
	
}
