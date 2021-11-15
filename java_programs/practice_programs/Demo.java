class Demo 
{
	public int main(int a,int b)
	{
		System.out.println(a+b);
		return(a+b);
	   
	}
	public static void main(String[] args) 
	{
		Demo d1 = new Demo();
		d1.main(2,5);
		System.out.println(d1.main(2,3));
	}
}
 