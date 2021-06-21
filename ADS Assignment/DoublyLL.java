class DoublyLL
{
	static Node head;
	static int  count=0;
	static class Node
	{
		int data;
		Node prev;
		Node next;
		Node(int d)
		{
			data=d;
			prev = next = null;	
		}
	}
	void InsertBegin(int data)
	{
		Node new_node = new Node(data);
		new_node.next=head;
		if(head != null)
			head.prev=new_node;
		head = new_node;
	}
	void InsertMiddle(Node prev_node,int data)
	{
		if(prev_node == null)
			System.out.println("not possible");
		Node new_node=new Node(data);
		new_node.next=prev_node.next;
		prev_node.next=new_node;
		new_node.prev=prev_node;
		if(new_node.next != null)
			new_node.next.prev=new_node;
	}
	void InsetEnd(int data)
	{
		Node temp = head;
		Node new_node= new Node(data);
		if(head == null)
		{
			new_node.prev=null;
			head = new_node;
			return;
		}
		while(temp.next != null)
		{
			temp=temp.next;
		}
		temp .next = new_node;
		new_node.prev= temp;
	}
	int display()
	{
		Node n= head;
		System.out.println("------------------------");
		while(n!=null)
		{
			System.out.print(n.data+ "->");
			count++;
			n=n.next;
		}
		return count;
	}
	void delete(int key)
	{
		Node temp=head,prev =null;
		//try
		////{
		if(temp!=null && temp.data==key)
		{
			head=head.next;
			return;                                               
		}
		while(temp!=null && temp.data !=key)
		{
			prev=temp;
			temp=temp.next;
		}
		prev.next=temp.next;
		//return;
		if(temp == null)
		{
			
				System.out.println("key not found");
				
		}
		return;
		//delete all list
		//head=null;   
		//}catch(Exception e)
		//{
			//System.out.println("key not found");
		//}
	}
	public static void main(String args[])
	{
		DoublyLL dl = new DoublyLL();
		dl.head=new Node(10);
		Node second = new Node(20);
		Node Third = new Node(30);
		dl.head.next = second;
		second.next = Third;
		System.out.println();
		dl.InsertBegin(220);
		System.out.println();
		dl.InsertMiddle(second,34);
		System.out.println();
		dl.InsetEnd(25);
		dl.display();
		System.out.println();
		//dl.delete(10);
		//dl.delete(30);
		dl.delete(85);
		dl.display();
		System.out.println();
	//	System.out.println("node count : "+count);
		
	}
}