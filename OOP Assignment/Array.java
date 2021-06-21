package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Array {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("shivani");
		list.add("shrikant");
		list.add("shivani");
		//method-1
		for(String name:list) {
			System.out.println(name);
		}
		//method-2
		Iterator<String> itr=list.Iterator();
		while(itr.hasNext());
		System.out.println(itr.next());
	}

}
