package maps;

import java.util.HashMap;

public class Maps {

	public static void main(String[] args) {
		//Maps are collection of key value pairs. Similar to look up tables.
		//examples: employee names with ids, golf players with scores, pets and birthdays.
		
		//why we don't use Map instead of HashMap is Map is an interface.
		HashMap<String, Integer> employeeIds = new HashMap<>();//can't use primitives, should be used with classes.
		employeeIds.put("Berkay", 12345);
		employeeIds.put("Anıl", 54321);
		employeeIds.put("Fatih", 92325);
		
		//printing the data on the map
		System.out.println(employeeIds);
		//output is {Berkay=12345, Fatih=92325, Anıl=54321}
		//see the Fatih data is in front of Anıl which i put them in reverse order.
		//Map's doesn't guarantee a certain order. It's job is to store the key pairs.
		
		//printing Anıl's employeeId
		System.out.println(employeeIds.get("Anıl"));
		//output is 54321.	
		
		//checking if a specific KEY input is registered on the map or not. @return boolean 
		System.out.println(employeeIds.containsKey("Fatih"));
		//output is true (Fatih=92325)
		
		//checking if a specific KEY input is registered on the map or not. @return boolean 
		System.out.println(employeeIds.containsKey("Ahmet"));
		//output is false because there is no register on the EmployeeId key including Ahmet.
		
		//checking if a specific VALUE is registered on the map or not. @return boolean
		System.out.println(employeeIds.containsValue(54321));
		//output is true Berkay=12345
		
		//putting an already existing pair will override the existing data on the map.
		employeeIds.put("Anıl", 82572);
		System.out.println(employeeIds);
		//output is {Berkay=12345, Fatih=92325, Anıl=82572}
		
		//this is a method for changing an existing pair.
		employeeIds.replace("Berkay", 777);
		System.out.println(employeeIds);
		//output is {Berkay=777, Fatih=92325, Anıl=82572}
		
		//Enes does not exist in the map and replace method isn't going to change the map structure.
		employeeIds.replace("Enes", 555);
		System.out.println(employeeIds);
		//output is {Berkay=777, Fatih=92325, Anıl=82572}
		
		//Add the key value pair specified if the key given doesn't already exist in the map.
		//Berkay already exists in the map, so this method does not affect the map.
		employeeIds.putIfAbsent("Berkay", 222);
		
		//Talha will be added to the map since there is no key pair with Talha isn't in our map.
		employeeIds.putIfAbsent("Talha", 23954);
		System.out.println(employeeIds);
		//output is {Berkay=777, Fatih=92325, Talha=23954, Anıl=82572}
		
		//remove the specified key's mapping from the map.
		employeeIds.remove("Berkay");
		System.out.println(employeeIds);
		//output is {Fatih=92325, Talha=23954, Anıl=82572}
	}

}
