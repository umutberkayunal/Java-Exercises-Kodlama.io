package oop1;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product();
		
		product1.setName("Spor ayakkabisi");
		product1.setUnitPrice(1269);
		product1.setDiscountRate(7.33);
		product1.setUnitsInStock(18);
		product1.setImageUrl("sporayakkabisi.png");
		
//		product1.name = "Spor ayakkabisi";
//		product1.unitPrice = 1269;
//		product1.discountRate = 7.33;
//		product1.unitsInStock = 18;
//		product1.imageUrl = "sporayakkabisi.png";
		
//		System.out.println(product1.name);
//		System.out.println(product1.unitPrice);
//		System.out.println(product1.discountRate);
//		System.out.println(product1.unitsInStock);
//		System.out.println(product1.imageUrl);
		
		Product product2 = new Product();
		
		product2.setName("Kosu ayakkabisi");
		product2.setUnitPrice(779);
		product2.setDiscountRate(3);
		product2.setUnitsInStock(51);
		product2.setImageUrl("kosuayakkabisi.png");
		
//		product2.name = "Kosu ayakkabisi";
//		product2.unitPrice = 779;
//		product2.discountRate = 3;
//		product2.unitsInStock = 51;
//		product2.imageUrl = "kosuayakkabisi.png";
		
		Product product3 = new Product();
		
		product3.setName("Yuruyus ayakkabisi");
		product3.setUnitPrice(849);
		product3.setDiscountRate(4);
		product3.setUnitsInStock(5);
		product3.setImageUrl("yuruyusakkabisi.png");
		
//		product3.name = "yuruyus ayakkabisi";
//		product3.unitPrice = 849;
//		product3.discountRate = 4;
//		product3.unitsInStock = 5;
//		product3.imageUrl = "sporayakkabisi.png";
		
		Product[] products = {product1, product2, product3};
		
		for (Product product : products) {
			System.out.println(product.getName());
			System.out.println(product.getUnitPrice());
			System.out.println(product.getDiscountRate());
			System.out.println(product.getUnitsInStock());
			System.out.println(product.getImageUrl());
			
//			System.out.println(product.name);
//			System.out.println(product.unitPrice);
//			System.out.println(product.discountRate);
//			System.out.println(product.unitsInStock);
//			System.out.println(product.imageUrl);
		}
	}

}
