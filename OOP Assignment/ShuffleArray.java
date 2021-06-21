package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArray {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("shivani");
		list.add("shiva");
		list.add("shivan");
		list.add("shiv");
		System.out.println("Before shuffle: "+list);
		Collections.shuffle(list);
		System.out.println("After shuffle: "+list);
	}

}
