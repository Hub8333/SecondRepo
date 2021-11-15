class AccessMethod2 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Starts...");
		AccessMethod1.run();
		AccessMethod1 a1 = new AccessMethod1();
		a1.run1();
		System.out.println("Main Ends...");
	}
}
