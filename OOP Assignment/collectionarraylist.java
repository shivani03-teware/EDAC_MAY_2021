package ArrayList;

import java.util.ArrayList;

public class collectionarraylist {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("black");
		list.add("red");
		list.add("white");
		System.out.println(list);
		for(String s : list) {
			System.out.println(s);
		}
	}

}
