package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.name = "Laptop";
		product.id = 1;
		product.description = "Gaming laptop";
		product.price = 15000;
		product.stockAmount = 5;
		
		ProductManager productmanager = new ProductManager();
		productmanager.add(product);
	}

}
