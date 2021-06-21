package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortArray {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("by");
		list.add("mam");
		list.add("anita");
		list.add("sunita");
		System.out.println("Before sorting: "+list);
		Collections.sort(list);
		System.out.println("After sorting: "+list);
	}

}
