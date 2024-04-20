import java.util.LinkedList;

public class ShoppingCart {

	 private LinkedList<Product> shoppingCart;
	 
	
	public ShoppingCart(LinkedList<Product> shoppingCart) {
		this.shoppingCart = shoppingCart;
	}
	public ShoppingCart() {
		shoppingCart = new LinkedList<Product>();
	}

	public void addProduct(Product p) {
		shoppingCart.add(p);
	}
	
	public double getSum() {
		double sum = 0;
		for (Product p: shoppingCart)
			sum += p.getPrice();
		return sum;
		
	}
}
