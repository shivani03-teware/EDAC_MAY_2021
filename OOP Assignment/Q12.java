import java.util.*;
class Q12{
	public static void main(String args[]){
	System.out.println("Enter 3 numbers :");
	Scanner sc = new Scanner(System.in);
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	int num3 = sc.nextInt();
	
	if(num1>num2){
		if(num1>num3)
			System.out.println(num1+" is greater number");
		
		else
			System.out.println(num3+ " is greater number");
	}
	else {
		if(num2>num3)
			System.out.println(num2+" is greater number");
		else 
			System.out.println(num3+ " is greater number");
	}
	System.out.println("..................................................");
	int ans = ((num1>num2)? ((num1>num3) ? num1 : num3) : ( (num2>num3) ? num2: num3));
	System.out.println(ans + " is greater number");
}
}