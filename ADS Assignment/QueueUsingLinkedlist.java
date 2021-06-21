//queue using linklist

class QueueUsingLinkedlist
{
	Node rear;
	Node front;
	class Node
	{
		int data;
		Node next;
		Node (int d)
		{
			data=d;
			next=null;
		}
	}
	void enqeue(int data)
	{
		Node new_node = new Node(data);
		if(rear== null)
		{
			rear = front = new_node;
			return;
		}
		rear.next=new_node;
		rear=new_node;
	}
	void dequeue()
	{
		if(front == null)
		{
			return;
		}
		Node temp=front;
		front = front.next;
		if(front==null)
		{
			rear=null;
		}
	}
	void display()
	{
		Node temp = front;
		while(temp != null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public static void main(String args[])
	{
		QueueUsingLinkedlist q = new QueueUsingLinkedlist();
		System.out.println("-----------enqeue()-----------");
		q.enqeue(10);
		q.enqeue(20);
		q.enqeue(30);
		q.enqeue(40);
		q.enqeue(50);
		q.display();
		System.out.println();
		System.out.println("------------dequeue()-----------");
		q.dequeue();
		q.dequeue();
		q.display();
		System.out.println();
	}
}