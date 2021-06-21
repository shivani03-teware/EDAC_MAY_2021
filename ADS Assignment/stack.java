public class stack
{
	int size=5;
	int arr[]=new int [size];
	int top;
	public stack()
	{
		top=-1;
	}
	public int push(int key)
	{
		if(top>=size-1)
		{
			System.out.println("overflow");
			return 0;
		}
		else
		{
			top=top+1;
			return arr[top] = key;
		}
	}
	public int pop()
	{
		System.out.println(arr[top]);
			return arr[top--];
	}
	
	public boolean isEmpty()
	{
		if( top == -1)
			System.out.println("Underflow");
			return true;
	
	}
	public boolean isFull()
	{
		if(top>=size-1)
			System.out.println("overflow");
			return true;
	}
	public int peek()
	{
		System.out.println(arr[top]);
		return 0;	
	}
	public void display()
	{
		for(int i=size-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}

	public static void main(String args[])
	{
		stack s = new stack();
		System.out.println("---------push element----------");
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.display();
		System.out.println("---------pop element----------");
			s.pop();
			s.pop();
		System.out.println("---------peek(top) element----------");
			s.peek();
		
	}
	
}