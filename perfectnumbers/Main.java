package perfectnumbers;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter a number to check if it is a perfect number:");
		Scanner myNum = new Scanner(System.in);
		int number = myNum.nextInt();
		int totalSum = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				totalSum += i;
			}
		}
		if (number == totalSum) {
			System.out.println("Number is perfect!");
		} else {
			System.out.println("Number is not perfect.");
		}
	}

}
