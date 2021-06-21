package ArrayList;

import java.util.ArrayList;

public class InsertArrayList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("shivani");
		list.add("shravani");
		list.add("snehal");
		//Insert an element
		System.out.println("Insert: " +list);
		list.add(0, "suresh");
		//Retrive an element
		System.out.println(list);
		System.out.println("Retrive: "+list.get(2));
		
		//Update an element list
		System.out.println(list.set(1, "susmit"));
		System.out.println(list);
	}

}
