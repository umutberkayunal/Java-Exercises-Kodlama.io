package inheritance;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		Employee employee = new Employee();
		
		customer.firstName = "berkay";
		employee.firstName = "ahmet";
		
		EmployeeManager employeemanager = new EmployeeManager();
		CustomerManager customermanager = new CustomerManager();
		
		employeemanager.add();
		customermanager.add();
		
		PersonManager personmanager = new PersonManager();
		personmanager.add();
		
		employeemanager.bestEmployee();
	}

}
