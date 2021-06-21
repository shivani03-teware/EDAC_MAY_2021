package Stack;

public class stack1 {
	int top =-1;
	int arr[] = new int[5];
void push(int data)
{
	if(isFull())
	{
		System.out.println("overflow");
	}
	else
	{
		top=top+1;
		arr[top]=data;
		
	}
	
}
void pop()
{
	if(top==-1)
	{
		System.out.println("underflow");
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
	if(top>=-1)
	{
		return true;
	}
	else
	{
		return false;
	}
}
int peek()
{
	return arr[top];
}

	public static void main(String args[])
	{
		stack1 s = new stack1();
		s.push(10);
		s.push(20);
		s.push(30);
		//System.out.println(s);
		s.peek();
		s.pop();
		//System.out.println(s);
	}
}
