/*create a non-static variable and print in the static method*/
class Test3 
{
	public double a = 1.234;


	public static void run()
	{
		Test3 obj = new Test3();
		System.out.println(obj.a);
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Starts...");
		run();
		System.out.println("Main Ends...");
	}
}
