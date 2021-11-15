class Test 
{
	public static void move(int i)
	{
		System.out.println("move "+i+" kms");
	}
    public static void move(String z)
	{
		System.out.println("move towards "+z+" direction");
	}
	public static void move(double a,String b)
	{
		System.out.println("move "+a+" kms in "+b+" direction");
	}
	public static void main(String[] args) 
	{
		move(7.8,"west");
		move(9);
		move("south");
	}
}
