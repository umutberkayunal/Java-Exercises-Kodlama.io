package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao{//Dao = data access object
	public void add(Product product) {
		//only and only db access codes here.... SQL
		System.out.println("added to database with JDBC");
	}
}

//JDBC - Hibernate