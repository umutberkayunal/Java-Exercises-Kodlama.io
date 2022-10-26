package staticDemo;

public class ProductManager {
	public void add(Product product) {
		//ProductValidator validator = new ProductValidator();
		if(ProductValidator.isValid(product)) {//ProductValidator is static now, we don't need to generate the object.
			System.out.println("added");
		} else {
			System.out.println("can't be added, invalid product information.");
		}
		
		ProductValidator productValidator = new ProductValidator();
		productValidator.something();
	}
}
