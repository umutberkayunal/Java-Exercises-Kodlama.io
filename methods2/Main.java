package methods2;

public class Main {

	public static void main(String[] args) {
		String message = "Bugün hava çok güzel";
		String newmessage = message.substring(0, 2);
		System.out.println(newmessage);
		
		int number = sum(5, 7);
		System.out.println(number);

		newmessage = giveCity();
		System.out.println(newmessage);
	}
	
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	
	public static String giveCity() {
		return "Eskişehir";
	}
}
