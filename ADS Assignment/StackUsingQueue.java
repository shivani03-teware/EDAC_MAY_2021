//Stack using queue implementation
class StackUsingQueue
{
	int data;
	int front=0;
	int rear=-1;
	int size=5;
	int arr[] = new int [size];
	void push(int data)
	{
		//try
		//{
			if(isFull())
			{
				System.out.println("Stack overflow");
			}
		//}catch(ArrayIndexOutOfBoundsException e)
		//{
		//	System.out.println("Stack Overflow");
		//}
			else
			{
				++rear;
				arr[rear]=data;
			}
		
	}
	void pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack underflow");
		}
		front++;
	}
	boolean isEmpty()
	{
		if(rear == front)
		{
			return true;
		}
		return false;
	}
	boolean isFull()
	{
		if(rear== size-1)
		{
			return true;
		}
		return false;
	}
	void peek()
	{
		System.out.println(arr[front]);
	}
	void display()
	{
		for(int i=0;i<size-1;i++)
		{
			System.out.println(arr[i]);
		}
	}		
	public static void main(String args[])
	{
		StackUsingQueue s = new StackUsingQueue();
		StackUsingQueue s1 = new StackUsingQueue();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		//s.push(50);
		//s.push(60);
		s.display();
		System.out.println("--------------------");
		s.pop();
		s.peek();
		//s.display();
	/*	for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)//1,2,3,4,5
			{							//2,3,4,5,1
				temp = rear.peek();
				rear.peek()=front;
				*/
	}
}
