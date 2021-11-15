class OverLoadQ4  
{
	public static void mul(double i,int j)
	{
		System.out.println(i*j);
	}
	public static void mul(int i,int j,int k)
	{
		System.out.println(i*j*k);
	}
	public void mul(int i,int j,double k)
	{
		System.out.println(i*j+k);
	}
	public void mul(double i,double j,int k)
	{
		System.out.println(i+j* k);
	}
	public static void main(String[] args) 
	{
		mul(5.5,2);
		mul(1,2,3);
        OverLoadQ4 obj=new OverLoadQ4();
		obj.mul(2,2,2.2);
		obj.mul(5.5,5.5,5);
	}
}
	