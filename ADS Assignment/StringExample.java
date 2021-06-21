/*public class StringExample
{  
	public static void main(String args[])
	{  
		String s1="java";//creating string by java string literal  
		char ch[]={'s','t','r','i','n','g','s'};  
		String s2=new String(ch);//converting char array to string  
		String s3=new String("example");//creating java string by new keyword  
		System.out.println(s1);  
		System.out.println(s2);  
		System.out.println(s3);  
	}
}  
*/
/*
class StringExample{  
 public static void main(String args[]){  
   String s="Sachin";  
   s.concat(" Tendulkar");//concat() method appends the string at the end  
   System.out.println(s);//will print Sachin because strings are immutable objects  
 }  
}  
*/
class StringExample{  
 public static void main(String args[]){  
   String s="Sa";  
   String s2 = new String ("Sachin");
    s="shivani";
   String s3=s2.intern();
  
   System.out.println(s3);//will print Sachin because strings are immutable objects  
    //System.out.println(s);
 }  
}  