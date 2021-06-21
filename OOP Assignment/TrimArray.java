package ArrayList;

import java.util.ArrayList;

public class TrimArray {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(10);
		list.add(2);
		list.add(5);
		list.add(3);
		list.add(7);
		list.add(10);
		list.trimToSize();
		for(int num:list)
		System.out.println("number= "+num);

	}

}
