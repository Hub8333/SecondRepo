class Demo 
{
	public static void main(String[] args) 
	{
		int k = 34;/* k variable is local to main method*/
		System.out.println(k);
		test(); 
	}
	public static void test()
	{
		int i=47;/* i variable is local to main method*/
		System.out.println(i);
	}
}
