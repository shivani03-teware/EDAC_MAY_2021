import java.util.*;
class Q8 {

	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter principle amount:");
	int p = sc.nextInt();
	System.out.println("Enter rate of interest :");
	int r = sc.nextInt();
	System.out.println("Enter time:");
	int t = sc.nextInt();
	int SI = (p*r*t)/100;
	System.out.println("Simple Interest = " +SI);
	}
}
