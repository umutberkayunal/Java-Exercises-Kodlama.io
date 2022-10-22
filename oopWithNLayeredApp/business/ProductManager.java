package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	private Logger[] loggers;
	
	public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}


	public void add(Product product) throws Exception {
		//business rules here
		if(product.getUnitPrice() < 10) {//a business rule
			throw new Exception("product price can not be lower than 10.");
		}
		//ProductDao productDao = new JdbcProductDao();//ProductDao interface is also reference for HibernateProductDao
		productDao.add(product);//and also JdbcProductDao
		//While a layer uses another layer's class it should access only with an interface. 
		for (Logger logger : loggers) {//<db, mail>
			logger.log(product.getName());
		}
	}
}
