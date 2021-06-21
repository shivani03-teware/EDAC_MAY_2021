class BST
{
	Node root;
	class Node
	{
		int data;
		Node left;
		Node right;
		public Node(int d)
		{
			data=d;
			left=right=null;
		}
	}
	public void  Insert(int key)
	{
		root =InsertData(root, key);
	}
	public Node InsertData(Node root,int key )
	{
		if(root == null)
		{
			root = new Node(key);
			return root;
		}
		if(key<root.data)
		{
			root.left=InsertData(root.left,key);
		}
		else if(key>root.data)
		{
			root.right=InsertData(root.right,key);
		}
		return root;
	}
	public void Inorder(Node node)
	{
		if(node == null)
		{
			return;
		}
		Inorder(node.left);
		System.out.print(node.data+" ");
		Inorder(node.right);
	}
	public void Preorder(Node node)
	{
		if(node == null)
		{
			return;
		}
		System.out.print(node.data+" ");
		Preorder(node.left);
		Preorder(node.right);
	}
	public void Postorder(Node node)
	{
		if(node == null)
		{
			return;
		}
		Postorder(node.left);
		Postorder(node.right);
		System.out.print(node.data+" ");
	}
	public static void main(String args[])
	{
		BST b = new BST();
		b.Insert(12);
		b.Insert(62);
		b.Insert(42);
		b.Inorder(b.root);
		System.out.println();
		b.Preorder(b.root);
		System.out.println();
		b.Postorder(b.root);	
	}
}