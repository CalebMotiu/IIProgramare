import java.util.ArrayList;
import java.util.List;

public class Warehouse {

	private List<Product> products;

	public Warehouse() {
		this.products = new ArrayList<>();
	}
	
	public void addProduct(Product product)
	{
		boolean exists = true;
		for (Product p : products)
			if (p.equal(product))
			{
				 p.setQuantity(p.getQuantity() + 1);
				 exists = false;
				 break; 
			}
		if (exists)
			products.add(product);
		
	}
	
	public void printProducts() {
		for (Product p : products)
			System.out.println(p);
	}
	
	
}
