public class Stack1
{
	int top=0;
	int size=5;
	int a[]=new int[size];
	Stack1()
	{
		top = -1;
	}
	public int isEmpty()
	{
		return top=-1;
	}
	public int  push(int n)
	{
		if(top>=size-1)
		{
			System.out.println("Overflow");
			return 0;
		}
		else
		{
			top=top+1;
			return a[top]=n;
		}
	}
	public void display()
	{
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i] );
		}
	}
		
	public int pop(int data)
	{
		if(top<0)
		{
			System.out.println("UnderFlow");
			return 0;
		}
		else
		{
				return a[top--]=data;
		}
	}
		
	public static void main(String args[])
	{
		Stack1 s = new Stack1();
		 s.push(10);
		 s.push(20);
		  s.push(30);
		   s.push(40);
		    s.push(50);
		 s.display();
		 s.pop(10);
		 	 s.display();
		 

	}
}
