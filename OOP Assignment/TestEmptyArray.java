package ArrayList;

import java.util.ArrayList;

public class TestEmptyArray {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		boolean list = list1.isEmpty();
		if(list==true) {
			System.out.println("The arraylist is empty");
		}
		else {
			System.out.println("The arraylist is not empty");
		}
		list1.add("shivani");
		boolean list2 = list1.isEmpty();
		if(list2==true) {
			System.out.println("The arraylist is empty");
		}
		else {
			System.out.println("The arraylist is not empty");
		}
		
		
	}

}
