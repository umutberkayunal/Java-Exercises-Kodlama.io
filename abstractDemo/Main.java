package abstractDemo;

public class Main {

	public static void main(String[] args) {
		 CustomerManager customermanager = new CustomerManager();
		 customermanager.databaseManager = new OracleDatabaseManager();
		 customermanager.getCustomers();
		 
		 customermanager.databaseManager = new SqlServerDatabaseManager();
		 customermanager.getCustomers();
	}

}
