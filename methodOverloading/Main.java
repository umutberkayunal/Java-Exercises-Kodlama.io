package methodOverloading;

public class Main {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		System.out.println(calculator.sum(3, 5));//result is 8 and sum(int, int) called
		System.out.println(calculator.sum(3, 5, 8));//result is 16 and sum(int, int, int) called.
	}

}
