package classesRecap;

public class Main {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		int result = calculator.sum(5, 53);
		System.out.println(result);
		System.out.println(calculator.divide(15.80f, 3.16f));
		System.out.println(calculator.multiply(15, 23));
		System.out.println(calculator.subtract(22, 14));
	}

}
