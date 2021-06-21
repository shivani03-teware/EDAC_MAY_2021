package Exception;

import java.util.Scanner;
class UserException extends Exception{
	UserException(){}
	UserException(String s){
		super(s);
	}
}
public class Vote {

	public static void main(String[] args){
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter age: ");
	int Uage=sc.nextInt();
		
			if(Uage>=18){
				try {
					throw new UserException("Eligible for voting");
				}catch(UserException ex) {
					System.out.println(ex.getMessage());
				}
			}else {
				System.out.println("Not eligible for voting");
			}
		}
	}


