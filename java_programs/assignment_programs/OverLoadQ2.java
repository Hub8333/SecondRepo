class OverLoadQ2 
{
	public static void main(int i,int j)
	{
		System.out.println(i-j);
	}
	public static void main(double i,int j)
	{
		System.out.println(i-j);
	}
	public static void main(String[] args) 
	{
		main(10,1);
		main(110.0,10);
	}
}
