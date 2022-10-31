package linkedlistVsArrayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		LinkedList<String> namesLinkedList = new LinkedList<>();
		namesLinkedList.add("John");
		namesLinkedList.add("Paul");
		namesLinkedList.add("Chris");
		namesLinkedList.add("Adam");
		System.out.println(namesLinkedList.get(2));
		namesLinkedList.add(1, "Jerry");
		System.out.println(namesLinkedList);
		
		ArrayList<String> namesArrayList = new ArrayList<>();
		namesArrayList.add("John");
		namesArrayList.add("Paul");
		namesArrayList.add("Chris");
		namesArrayList.add("Adam");
		System.out.println(namesArrayList.get(2));
		namesArrayList.add(1, "Jerry");
		System.out.println(namesArrayList);
	}

}
