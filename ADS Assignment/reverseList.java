class reverseList
{
	static Node head;
	static class Node 
	{
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
	}
	void Insert(int data)
	{
		if(head == null)
		{
			return;
		}
		Node new_node = new Node(data);
		head = head.next;
		new_node=head;
	}
	void reverse()
	{
		Node curr = head;
		Node prev = null, next=null;
		while(curr != null)
		{
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr= next;
		}
		head = prev;
	}
	void Display()
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	public static void main(String args[])
	{
		reverseList r=new reverseList();
		r.head=new Node(10);
		Node second = new Node(20);
	Node third = new Node(30);
		r.head.next = second;
		second.next = third;
		r.Display();
		System.out.println();
		r.reverse();
		r.Display();
	}
}