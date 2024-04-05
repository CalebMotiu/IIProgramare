
public class CompensatedProduct extends Product {

    private double coefficient;

	public CompensatedProduct(long code, String name, double price, double coefficient) {
		super(code, name, price);
		this.coefficient = coefficient;
	}
	



	public double getCoefficient() {
		return coefficient;
	}




	public String toString() 
	{
	return "Code: " + getCode() + ", Name: " + getName() + "\nPrice: " + (getPrice()*getCoefficient())+ ", Quantity: " + getQuantity() + "\n";

	}

}
