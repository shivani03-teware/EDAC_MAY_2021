class stackUsingSLL
{
	static Node top;
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next  = null;
		}
	}
	public void push(int data)
	{
		Node newnode = new Node(data);
		Node temp = top;
		if(top == null)
		{
			top = new Node(data);
			return ;
		}
		while(temp.next != null)
		{
			temp = temp.next;
		}
		temp.next=newnode;
	}
	public void pop()
	{
		Node temp =top;
		Node prev = top;
		try
		{
			if(top.next==null)
			{
				top=null;
				return;
			}
			while(temp.next != null)
			{
				prev = temp;
				temp =temp.next;
			}
			prev.next=null;
		}catch(NullPointerException e)
		{
			System.out.println("Stack is empty");
		}
	}
	public void display()
	{
		Node temp = top;
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	public int peek()
	{
		Node temp = top;
		while(temp != null)
		{
			temp = temp.next;
		}
		return temp.data;
	}
	public void clear_stack()
	{
		top=null;
	}
	public static void main(String args[])
	{
		stackUsingSLL s = new stackUsingSLL();
		System.out.println("-----------push()-----------");
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.display();
		System.out.println("-----------peek()-----------");
		s.peek();
		s.display();
		System.out.println("-----------pop()-----------");
		s.pop();
		s.pop();
		s.display();
		

	}
}