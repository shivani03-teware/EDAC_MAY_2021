package ArrayList;

import java.util.ArrayList;

public class retrive {
//retrive: fatching an element position get that element/value.
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("shivani"); //position 0
		list.add("shravani");// position 1
		list.add("snehal"); //position 2
		list.add("suresh"); //position 3
		System.out.println(list.get(3));
	}

}
