package ArrayList;

import java.util.ArrayList;

public class Remove {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("shivani");
		list.add("susmit");
		list.add("snehal");
		list.add("shiva");
		System.out.println(list);
		//Remove an element
		list.remove(3);
		System.out.println(list);
				
	}

}
