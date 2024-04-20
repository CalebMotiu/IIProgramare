
public class TestShoppingCart {

	public static void main(String[] args) {

		Product p1 = new Product("ceas",100.59);
		Product p2 = new Product("ochelari",20.25);
		ShoppingCart sc1 = new ShoppingCart();
		
		sc1.addProduct(p1);
		sc1.addProduct(p2);
		System.out.println(sc1.getSum());

	}

}
