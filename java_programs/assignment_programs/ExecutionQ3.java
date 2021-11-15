class ExecutionQ3 
{
	public static char a = '*';
	public boolean status = false;

	public static void test1(int i)
	{
		System.out.println(i);
	}
	public void test2(double i)
	{
		System.out.println(i);
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Starts...");
		test1(100);
		ExecutionQ3 obj = new ExecutionQ3();
		obj.test2(5.5);
		System.out.println(a);
		System.out.println(obj.status);
	}
}
