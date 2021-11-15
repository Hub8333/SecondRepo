class Main 
{
	public boolean check(int z)
	{
		int x = z;
		int y = 10;
		System.out.println(false);
		return true;
	}
	public static void call(int x)
	{
		Main mains = new Main();
		mains.check(x);
	}
	public static void main(String[] args) 
	{
		call(20);
		Main main = new Main();
		System.out.println(main.check(2));
	}
}
