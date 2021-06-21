/*
Q 6

All the banks operating in India are controlled by RBI. RBI has
set a well defined guideline (e.g. minimum interest rate,
minimum balance allowed, maximum withdrawal limit etc)
which all banks must follow. For example, suppose RBI has set
minimum interest rate applicable to a saving bank account to be
4% annually; however, banks are free to use 4% interest rate or to
set any rates above it.
Write a program to implement bank functionality in the above
scenario. Note: Create few classes namely Customer, Account,
RBI (Base Class) and few derived classes (SBI, ICICI, PNB etc).
Assume and implement required member variables and functions
in each class.

*/

import java.util.*;
class RBI
{
	String name;
	int AccNo ;
	int Cust_id;
	String IFSC ;
	int with_amount;

	double interest_rate;
	int Wid_limit;

	double getInterest()
	 {
		interest_rate = 0.04d;
		return interest_rate;
	 }
	int getWidLimit(int val) 
	{
		if(val<=20000)
		{
           		Wid_limit=20000;
           		return Wid_limit;
		}
		else
		{
			System.out.println("Entered amount in the limit : PROCEED....!!!!");
			return 0;
		}
	 }
}

class ICICI extends RBI
{
	ICICI(String name,int AccNo,int Cust_id,String IFSC,int with_amount,double interest_rate)
	{
		this.name=name;
		this.AccNo=AccNo;
		this.Cust_id=Cust_id;
		this.IFSC = IFSC;
		this.with_amount=with_amount;
		System.out.println(" Details: "+name+" "+AccNo+" "+ Cust_id+" "+ IFSC+" "+ with_amount);
	} 					
}
class SBI extends RBI
{
	SBI(String name,int AccNo,int Cust_id,String IFSC,int with_amount,double interest_rate)
	{
		this.name=name;
		this.AccNo=AccNo;
		this.Cust_id=Cust_id;
		this.IFSC = IFSC;
		this.with_amount=with_amount;
		System.out.println(" Details: "+name+" "+AccNo+" "+ Cust_id+" "+ IFSC+" "+ with_amount);
	}
}

class Que6
{
	public static void main(String[] args)
	{
		Que6 bank = new Que6();
		bank.getDetails();		
	}
	
	void getDetails()
	{	
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter Acc_type ICICI/SBI: "); 
		String Acc_type = sc.nextLine();
		String s1="ICICI";
		String s2="SBI";
		if(Acc_type.equals(s1))
		{
		goICICI();
		}
		else if(Acc_type.equals(s2))
		{
		goSBI();
		}
	}		
	
	void goICICI()	
	{
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter name , AccNo, Cust_id, IFSC ,Withdrowal amount : ");
		String name = sc.nextLine();
		int AccNo = sc.nextInt();
		int Cust_id = sc.nextInt();
		String IFSC = sc.nextLine();
		IFSC = sc.nextLine();
		int with_amount = sc.nextInt(); 
		RBI object = new RBI();
		int value= object.getWidLimit(with_amount);
		double values=object.getInterest();
		ICICI obj = new ICICI(name,AccNo,Cust_id,IFSC,value,values);	
	}
	void goSBI()
	{
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter name , AccNo, Cust_id, IFSC ,Withdrowal amount : ");
		String name = sc.nextLine();
		int AccNo = sc.nextInt();
		int Cust_id = sc.nextInt();
		String IFSC = sc.nextLine();
		IFSC = sc.nextLine();
		int with_amount = sc.nextInt();
		RBI object = new RBI();
		double values=object.getInterest();
		int value= object.getWidLimit(with_amount);
		SBI obj =new SBI(name,AccNo,Cust_id,IFSC,value,values);
	}	
}