class DLL{
Node head;
class node 
{
	int data;
	Node prev;
	Node next;
	Node(int d)
	{
	data = d;
	prev=next=null;
	}
	void InsertB(int data)
	{
		Node new_node = new Node(data);
		new_node.next=head;
		head = new_node;
		
	}
	void InsertMid()
	{
	}
	void InsertEnd()
	{
	}
	void display()
	{
	}
	public static void main(String args[])
	{
		DLL d = new DLL();
		d.head = new Node();
}
}
