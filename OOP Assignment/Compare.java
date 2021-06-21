package ArrayList;

import java.util.ArrayList;

public class Compare {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(1);
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(1);
		//compare arraylist using .equals() methods
		System.out.println(list1.equals(list2));
		list2.add(2);
		System.out.println(list1.equals(list2));
		
	}

}
