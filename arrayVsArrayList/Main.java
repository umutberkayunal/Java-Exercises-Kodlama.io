package arrayVsArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		String[] friendsArray = {"John", "Chris", "Eric", "Luke"};
		
		//wrapper class Integer
		//ArrayList<Integer> friendsArrayList = new ArrayList<>();
		
		ArrayList<String> friendsArrayList = new ArrayList<>(Arrays.asList("John", "Chris", "Eric", "Luke"));
		System.out.println(friendsArray[0]);
		System.out.println(friendsArrayList.get(1));
		
		//length is field of an array.
		System.out.println(friendsArray.length);
		
		//size is a method call.
		System.out.println(friendsArrayList.size());
		
		
		//adding an element to arraylist
		friendsArrayList.add("Mitch");
		System.out.println(friendsArrayList.get(4));
		
		//set element
		friendsArray[0] = "Carl";
		System.out.println(friendsArray[0]);
		
		//set(pos, value);
		friendsArrayList.set(0, "Carl");
		System.out.println(friendsArrayList.get(0));
		
		//remove an element
		//can't remove in arrays.
		friendsArrayList.remove("Chris");
		System.out.println(friendsArrayList.get(1));
		
		//print
		System.out.println(friendsArray);
		System.out.println(friendsArrayList);
	}

}
