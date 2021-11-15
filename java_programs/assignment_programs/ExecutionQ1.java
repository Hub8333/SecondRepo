class ExecutionQ1 
{
	public static int a = 100;
	public String name = "jspiders";
    public void run()
	{
		System.out.println(name);
		System.out.println(a);
	}

	public static void main(String[] args) 
	{
		System.out.println("Main Starts...");
		int i = 100;
		System.out.println(i);
		System.out.println(a);
		ExecutionQ1 obj = new ExecutionQ1();
		System.out.println(obj.name);
		obj.run();
		System.out.println("Main Ends...");
	}
}
