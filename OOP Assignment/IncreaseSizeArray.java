package ArrayList;

import java.util.ArrayList;

public class IncreaseSizeArray {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(3);
		list.add(2);
		list.add(5);
		list.add(3);
		System.out.println("Original:  "+list);
		list.ensureCapacity(5);
		list.add(6);
		list.add(7);
		System.out.println("new array: "+list);
	}

}
