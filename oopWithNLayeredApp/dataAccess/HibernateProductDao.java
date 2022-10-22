package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao{
	public void add(Product product) {
		//only and only db access codes here.... SQL
		System.out.println("added to database with Hibernate");
	}
}
