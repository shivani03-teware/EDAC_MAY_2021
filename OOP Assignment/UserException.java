class UserException extends Exception
{
	UserException(){}
	UserException(String s );
	super(s);
}
public class Main
{
public static void main(String args[])
{
int Uage=13;
if(Uage>=18)
{
 System.out.println("eligible for voting");
}


}
}