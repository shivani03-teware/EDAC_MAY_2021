class PalindromeUsingstack{
	int data;
	int top=-1;
	char arr[] = new char[];
	void push(int data)
	{
		arr[++top]=data;
	}
	void pop()
	{
		arr[top--];
	}
	/*boolean isEmpty()
	{
	if(top>=size-1)
	

	}
	boolean isFull()
	{
	}
	*/
	public static void main(String args[])
	{
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String name = sc.nextLine();
		PalindromeUsingstack p = new PalindromeUsingstack();
		for(int i=0;i<
		p.push(10);
		
	}
}