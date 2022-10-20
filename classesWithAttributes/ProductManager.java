package classesWithAttributes;

public class ProductManager {//solid principle S(single responsibility) we could've done this job at Product class
	public void add(Product product) {//but according to single responsibility rule every class should service one
		//job.
		//JDBC code here
		System.out.println("added product:" + product.name);
	}
}
