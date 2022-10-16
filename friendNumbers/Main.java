package friendNumbers;

public class Main {

	public static void main(String[] args) {
		int sayi1 = 220;
		int sayi2 = 284;
		int toplamBolen1 = 0;
		int toplamBolen2 = 0;
		for (int i = 1; i < sayi1; i++) {
			if (sayi1 % i == 0) {
				toplamBolen1 += i;
			}
		}
		for (int i = 1; i < sayi2; i++) {
			if (sayi2 % i == 0) {
				toplamBolen2 += i;
			}
		}
		if((toplamBolen1 == sayi2) && (toplamBolen2 == sayi1)) {
			System.out.println("Two numbers are friend.");
		} else {
			System.out.println("Two numbers are not friend.");
		}
	}

}
