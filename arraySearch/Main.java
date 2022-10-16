package arraySearch;

public class Main {

	public static void main(String[] args) {
		int [] numbers = new int[] {1, 2, 5, 7, 9, 0};
		int toFind = 0;
		boolean isFound = false;
		
		for (int i = 0; i < numbers.length; i++) {
			if (toFind == numbers[i]) {
				System.out.println(toFind + " found on the array in the " + (i+1) + " index");
				isFound = true;
				break;
			}
		}
		if (isFound == false) {
			System.out.println("The search has been completed without finding " + toFind + " on the array.");
		}
	}

}
