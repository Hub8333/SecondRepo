/*create a non-static variable and print in the non-static method*/
class Test2 
{
	public String name = "naveen";
    
	public void run()
	{
		System.out.println(name);
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Starts...");
		Test2 obj = new Test2();
		obj.run();
		System.out.println("Main Ends...");
	}
}
