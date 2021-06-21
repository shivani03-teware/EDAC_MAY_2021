/*
 * 11. Write a Java program to reverse elements i n an array list.
 */
package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArray {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println("Before reverse array: "+list);
		Collections.reverse(list); //method 1
		System.out.println("After reversing array: "+list);
		Collections.reverseOrder(); // method 2
		System.out.println("After reversing array: "+list);
		Collections.reverseOrder(); //method 3
		System.out.println("After reversing array: "+list);
		

		

	}

}
