package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class JoinArrayList {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("shivani");
		list1.add("is");
		list1.add("good girl");
		//System.out.println(list1);
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("shiv");
		list2.add("is");
		list2.add(" girl");
		//System.out.println(list2);
		list1.addAll(list2);
		System.out.println(list1);
		

	}

}
