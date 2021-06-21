import java.util.*;

class Q9{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int days = sc.nextInt();
	int Years = (days/365);
	int months = (days%365)/30;
	int Days = (days%365)%30;
	System.out.println(Years+ " " +months+ " " +Days);
	
	
	}

}