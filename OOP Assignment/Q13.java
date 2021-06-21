import java.util.*;
class Q13{
	public static void main(String args[]){
	System.out.println("Enter year :");
	Scanner sc = new Scanner(System.in);
	int year = sc.nextInt();
	if((year%4 == 0) || (year%100 == 0)){
	System.out.println(year+" Leap Year");
	}
	else {
	System.out.println(year+"Not a leap year");
	}
	}
}