package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1 = new Product(1, "Iphone XR", 15000);
		
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		
		ProductManager productManager = new ProductManager(new JdbcProductDao(), loggers);
		productManager.add(product1);//successfully added because fits business rules
		
		//Because of interface, we are no longer dependent to Jdbc or Hibernate, we can send any to Productmanager because
		//it expects a ProductDao instance, and both Jdbc and Hibernate Dao's are fitting the instance.
		System.out.println("----------------------------");
		
		ProductManager productManager2 = new ProductManager(new HibernateProductDao(), loggers);
		Product product2 = new Product(2, "Bubble gum", 15);
		productManager2.add(product2);

		System.out.println("----------------------------");
		
		Product product3 = new Product(3, "Bubble gum", 5);
		productManager2.add(product3);//product can not be added because business rules price should be >10
	}

}
