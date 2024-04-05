
public class ProdcutManagement {

	public static void main(String[] args) {
		
        Warehouse warehouse = new Warehouse();


		Product p1 = new CompensatedProduct(214920,"Rolex Submariner",50000,1.5);
		Product p2 = new NonCompensatedProduct(214900,"Rolex Day-Date",25000);
		Product p3 = new NonCompensatedProduct(214900,"Rolex Day-Date",25000);

		warehouse.addProduct(p1);
		warehouse.addProduct(p2);
		warehouse.addProduct(p3);
		
		warehouse.printProducts();

	}

}
