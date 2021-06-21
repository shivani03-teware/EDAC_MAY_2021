package ArrayList;

import java.util.ArrayList;

public class ReplaceArray {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("shivani");
		list.add("shiva");
		list.add("shivu");
		System.out.println(list);
		for(int i=0;i<list.size();i++) {
			if(list.get(i).equalsIgnoreCase("shivu"));
			list.set(2,"shiv");
		}
		System.out.println(list);

	}

}
