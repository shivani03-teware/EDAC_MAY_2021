import java.util.*;
class Q7{

      public static void main(String args[]){
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter 5 subjects marks:");
	  int m1 = sc.nextInt();
	  int m2 = sc.nextInt();
	  int m3 = sc.nextInt();
	  int m4 = sc.nextInt();
	  int m5 = sc.nextInt();
	  int sum = (m1+m2+m3+m4+m5);
	  float per = (sum/500)*100;
	  System.out.println("Percentage marks = " +per+ " %");
}
}