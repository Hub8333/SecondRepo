class Argument 
{
	public static void main(String[] args) 
	{
		test1(99);
		Argument a1=new Argument();
		a1.test2(false);
		test3('*',9.9);
		a1.test4("naveen",007);
	}
	public static void test1(int a)
	{
		System.out.println(a);
	}
	public void test2(boolean i)
	{
		System.out.println(i);
	}
	public static void test3(char i,double z)
	{
		System.out.println(i);
		System.out.println(z);
	}
	public void test4(String a,int i)
	{
		System.out.println(a);
		System.out.println(i);
	}

}
