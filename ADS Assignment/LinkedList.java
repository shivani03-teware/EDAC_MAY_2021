class LinkedList
{
	static  Node head; //create ref var of node class for first node
	static int count=0;
	static class Node   // Creation of node
	{
		int data;
		Node link;  //ref var of node class
		Node(int d)   //assign values
		{
			data=d;
			link=null;
		}
	}
	public int  display()
	{
		Node n = head;
		System.out.println("------------------------------");  
		while(n!=null)                                                                                    // traverse the list till last node 
		{
			System.out.print(n.data+ "->");                                                    //print values
			count++;
			n= n.link;                                                                                       //new position of n ( next node address assign to n)
		}
		return count;
	}
	//Insert at begin
	void InsertBegin(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.link=head;
		head =new_node;
	}
	//Insert at middle 
	void InsertInMiddle(Node prev_node,int new_data)
	{
		Node new_node = new Node(new_data);		
		if(prev_node == null)
		{
			System.out.println("list is empty");
		}
		new_node.link = prev_node.link;
		prev_node.link=new_node;
	}
	//Insert at last
	void InsertEnd(int new_data)
	{
		Node new_node= new Node(new_data);
		if(head == null)
		{
			head =new Node(new_data);
			return;
		}
			new_node.link =null;
			Node n= head;
			while(n.link != null)
				n= n.link;
				n.link= new_node;
	}
	
	void delete(int key)
	{
		//Delete node from 1st position
		Node temp = head;
		Node prev=null;
		if(temp != null && temp.data==key)
		{
			head =head.link;
			return;
		}
		//Delete node from middle position
		while(temp !=null && temp.data!=key)
		{
			 prev = temp;
			 temp = temp.link;
		}
		prev.link = temp.link;
		//Delete node from last position
		/*if(temp == null)
		{	
			//return; 
			prev.link=temp.link;
		}*/
		//count--;
	}	
	
	public static void main(String args[])
	{
		LinkedList l1=new LinkedList();
		l1.head = new Node(10);                                                                    // allocate memory to first node
		Node second =new Node(20);                                                            //allocate memory to second node
		Node Third = new Node(30);                                                              // allocate memory to third node
		l1.head.link = second;                                                                         // link fisrt node and second node
		second.link=Third;                                                                              //link second node and third node 
		l1.InsertBegin(40);
		l1.InsertInMiddle(second,44);
		l1.InsertEnd(34);
		System.out.println();
		System.out.println("================================");  
		l1.delete(40);
		l1.delete(20);
		l1.delete(34);
		l1.display();
		System.out.println();
		System.out.println("node count: "+count);
	}
}
