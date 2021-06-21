package ArrayList;

import java.util.ArrayList;
import java.util.*;
public class Iterate {

	public static void main(String[] args) {
		ArrayList<String> list =new ArrayList<>();
		list.add("shivani");
		list.add("shravani");
		list.add("snehal");
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
