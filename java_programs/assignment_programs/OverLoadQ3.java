class OverLoadQ3 
{
	public void main(int i,int j)
	{
		System.out.println(i*j);
	}
	public double main(double i,double j)
	{
		System.out.println(i*j);
		return i*j;
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Starts...");
		OverLoadQ3 obj = new OverLoadQ3();
		double a = obj.main(5.1,5.1);
		obj.main(5,8);
		System.out.println("Main Ends...");
	}
}
