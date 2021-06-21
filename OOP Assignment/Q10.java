import java.util.*;

class Q10{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two numbers:");
	int X = sc.nextInt();
	int Y = sc.nextInt();
	X = X+Y;
	Y = X-Y;
	X = X-Y;
System.out.println("Swapping without using third variable :" +X+ " " +Y);
}
}