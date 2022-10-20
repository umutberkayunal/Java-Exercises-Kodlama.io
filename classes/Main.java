package classes;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		System.out.println(customerManager.number);
		CustomerManager customerManager2 = customerManager;
		customerManager2.number = 193;
		System.out.println(customerManager.number);
		
		//in stack both customerManager and customerManager2 points to same object in heap. Thus output
		//is changed even customerManager's number is not changed.
		
		CustomerManager customerManager3 = new CustomerManager();
		customerManager = customerManager3;
		//garbage collector will clean up customerManager's share on the memory because it is now
		//pointing to customerManager3's instance on heap.
		//number is now back to 58 because newly created customerManager3 helds 58.
		System.out.println(customerManager.number);
		
		
		
		customerManager.add();
		customerManager.remove();
		customerManager.update();
	}

}