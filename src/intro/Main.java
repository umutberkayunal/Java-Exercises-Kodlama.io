package intro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner myNum = new Scanner(System.in);
		int number = myNum.nextInt();
		int remainder = number % 2;
		System.out.println(remainder);
		boolean isPrime = true;
		
		if(number < 2) {
			System.out.println("Invalid input");
		}

		for (int i = 2; i < number; i++) {
			if(number % i == 0) {
				isPrime = false;
			}
		}
		if(isPrime) {
			System.out.println("Number is prime.");
		} else {
			System.out.println("Number is not prime.");
		}
	}
}
