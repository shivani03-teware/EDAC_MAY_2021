import java.util.*;

class Q14{

  public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  	System.out.println("Enter gender (f for female & m for male): ");
  char ch = sc.next().charAt(0);
  	//System.out.println("Enter male age:");
 // int m = sc.nextInt();
  	System.out.println("Enter age: ");
	 // int f = sc.nextInt();
	    int age = sc.nextInt();
	   
  if(age >=21 && ch == 'm') 
	System.out.println("Eligible for marriage ");
  else if (age >=18 && ch == 'f')
	  System.out.println("Eligible for marriage");
  else
  System.out.println("Not eligible for marriage ");
  
}
}
