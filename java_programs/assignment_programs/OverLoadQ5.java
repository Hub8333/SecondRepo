class OverLoadQ5 
{
	public static void multiply(int i,int j)
	{
		System.out.println(i*j);
	}
	public static double multiply(int i,double j)
	{
		return i*j;
	}
	public int multiply(int i,int j,int k)
	{
		return i*j*k;
	}
	public static void main(String[] args)
	{
		multiply(5,2);
		double result1=multiply(4,1.3);
		System.out.println(result1);
		OverLoadQ5 obj=new OverLoadQ5();
		int result2=obj.multiply(7,3,2);
		System.out.println(result2);
	}
}
