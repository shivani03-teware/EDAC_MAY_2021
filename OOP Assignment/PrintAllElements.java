package ArrayList;

import java.util.ArrayList;

public class PrintAllElements {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("shivani");
		list.add("shiva");
		list.add("shivu");
		System.out.println("Originl: "+list);
		for(String num: list)
			System.out.println(num);
		
	}

}
