package methods3;

public class Main {

	public static void main(String[] args) {
		int sum = sum2(2, 5, 9, 10, 53);
		System.out.println(sum);	
	}
	
		public static int sum(int num1, int num2) {
			return num1 + num2;
		}
		
		public static String giveCity() {
			return "Eskişehir";
		}
		
		public static int sum2(int... numbers) { //variable arguments
			int sum = 0;
			for (int num : numbers) {
				sum += num;
			}
			return sum;
		}
	}
