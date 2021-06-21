class Stack 
{
	int top = -1;
	int size = 5;
	int arr[] = new int[size];
	void push(int data)
	{
		if(isFull())
		{
		System.out.println("Overflow");
		}
		else
		{
			top++;
			arr[top]=data;
		}
	}
	void pop()
	{
		if(isEmpty())
		{
			System.out.println("Underflow");
		}
		else
		{
			top--;
		}
	}
	boolean isEmpty()
	{
		if(top==-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	boolean isFull()
	{
		if(top>=size-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	void peek()
	{
		System.out.println(arr[top]);
	}
	void display()
	{
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}
	public static void main(String args[])
	{
		Stack s = new Stack();
		s.push(11);
		s.push(12);
		s.push(13);
		s.push(14);
		s.push(22);
		System.out.println();
		s.display();
		System.out.println("................Top element in stack.................");
		s.peek();
		s.pop();
	}
		
}