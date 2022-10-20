package classes;

public class Main {

	public static void main(String[] args) {
		//reference type
		//reference types create a pointer on the stack and points to the heap. all the information is stored on heap
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
		
		//value-type
		//value-types are on the stack.
		int number1 = 10;
		int number2 = 20;
		number2 = number1;
		number1 = 30;
		System.out.println(number2);
		
		//arrays are reference types. 
		int[] numbers1 = new int[] {1, 2, 3};
		int[] numbers2 = new int[] {4, 5, 6};
		numbers2 = numbers1;
		numbers1[0] = 50;
		System.out.println(numbers2[0]);
	}

}