package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpdateElement {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("shivani");
		list.add("shravani");
		list.add("suresh");
		System.out.println(list);
		//update an element
		list.set(2, "sunita");
		System.out.println(list);
		// Update multiple elements in an array
		List<String> ls = Arrays.asList("shiva","susmit","shrava");
		list.addAll(ls);
		System.out.println(list);
	}

}
