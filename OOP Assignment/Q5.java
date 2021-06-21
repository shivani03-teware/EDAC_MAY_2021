import java.util.*;

class Q5{
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter radius of circle:");
	float pi = 3.14f;
	float r = sc.nextFloat();
	float area = pi*r*r;
	System.out.println("Area of circle: "+area);
	float circumference = 2*pi*r;
	System.out.println("Circumference of circle: "+circumference);
	}

}