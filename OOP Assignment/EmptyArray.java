package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class EmptyArray {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("shivani");
		list1.add("is");
		list1.add("good girl");
		System.out.println(list1.isEmpty());
		list1.clear();
		System.out.println(list1.isEmpty());
		

	}

}
