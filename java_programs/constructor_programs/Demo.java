class Demo 
{
	public int a;
	public Demo(int a)
	{
		this.a = a;
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		Demo d1 = new Demo(77);
		Demo d2 = new Demo(56);
		Demo d3 = new Demo(33);
		Demo d4 = new Demo(47);
	}
}
