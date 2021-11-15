/*create a static variable and print in the non-static method*/
class Test4 
{
	public static int a = 100;

	public void main()
	{
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Starts...");
		Test4 obj = new Test4();
		obj.main();
		System.out.println("Main Ends...");
	}
}
