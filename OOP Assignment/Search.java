package ArrayList;

import java.util.ArrayList;

public class Search {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("shivan");
		list.add("sunita");
		list.add("suresh");
		//System.out.println(list);
		int index = list.indexOf("suresh");
		if(index == -1) {
			System.out.println("The element is not in the ArrayList");
		}else
			System.out.println("The element is in the ArrayList at index  : "+index);
	}

}
