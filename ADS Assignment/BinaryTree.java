public class BinaryTree
{
	 static Node root;
	 static class Node
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
	BinaryTree()
	{
		root = null;
	}
	BinaryTree(int d)
	{
		root = new Node(d);
	}
	public void Inorder(Node node)
	{
		if(node == null)
		{
			return;
		}		
		Inorder(node.left);
		System.out.println(node.data);
		Inorder(node.right);
		//System.out.println(node.data);
		//Inorder(root);
	}
	/*public void Inorder()
	{
		Inorder(root);
	}*/
	public void Preorder(Node node)
	{
		if(node == null)
		{
			return;
		}
		System.out.println(node.data);
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
		System.out.println(node.data);
	}
	public static void main(String args[])
	{
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(11);
		tree.root.left = new Node(12);
		tree.root.right=new Node(13);
		tree.root.left.left=new Node (23);
		tree.root.right.right=new Node (33);
		tree.Inorder(root);
		tree.Preorder(root);
		tree.Postorder(root);
		
	}
}
