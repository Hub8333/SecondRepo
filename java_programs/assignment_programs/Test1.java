/*create a static variable and print in the static method*/
class Test1 
{
	public static int i = 100;

	public static void run()
	{
		System.out.println(i);
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Starts...");
		run();
		System.out.println("Main Ends...");
	}
}
