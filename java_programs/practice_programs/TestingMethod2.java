class TestingMethod2 
{
	public int show(int c)
	{
		System.out.println("shoe method...");
		return c;
	}
	public static void main(String[] args) 
	{
		TestingMethod2 t2 = new TestingMethod2();
		t2.show(10);
		System.out.println(t2.show(20));
	}
}
