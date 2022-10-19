package methods;

public class Main {

	public static void main(String[] args) {
		searchNumber(4);
		searchNumber(5);
		searchNumber(13);
	} 
	
	public static void searchNumber(int toSearch) {
		int[] sayilar = new int[] {1, 2, 5, 7, 9, 0};
		boolean isFound = false;
		
		for(int sayi : sayilar) {
			if(sayi == toSearch) {
				isFound = true;
				break;
			}
		}
		
		if(isFound) {
			printInfo("Element:" + toSearch + " is found on the array.");
		} else {
			printInfo("Array does not contain the element:" + toSearch);
		}
	}
	
	public static void printInfo(String message) {
		System.out.println(message);
	}
}
