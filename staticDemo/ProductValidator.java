package staticDemo;

public class ProductValidator {
	
	static {//this is a static constructor block.
		System.out.println("Static Constructor block executed");
	}
	static {
		System.out.println("Static Constructor block executed");
	}
	
	public ProductValidator() {
		System.out.println("Constructor block executed");
	}
	
	public static boolean isValid(Product product) {
		//static method can be called without creating instance.
		if(product.price > 0 && !product.name.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
	public void something() {
		
	}
	
	//inner class can be static
//	public static class anotherClass {
//		public static void delete() {
//			
//		}
//	} 
	
}
