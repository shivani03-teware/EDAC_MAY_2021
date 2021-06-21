package Array;
import java.util.*;
public class array {

	public static void main(String[] args) {
		String arr[] = new String[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter names:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextLine();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println("Displaying Entered names: "+arr[i]);
		}
	}

}
