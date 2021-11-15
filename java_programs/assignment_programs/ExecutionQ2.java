class ExecutionQ2 
{
	public static void main()
	{
		System.out.println("Hello Jspiders");
	}
	public void run()
	{
		System.out.println("Run Along The Zone");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Starts...");
		main();
		ExecutionQ2 obj = new ExecutionQ2();
		obj.run();
		System.out.println("Main Ends...");
	}
}
