package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Swap {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(2);
		list.add(5);
		Collections.swap(list, 0, 2);
		System.out.println(list);

		
	}
	
}

