class Rectangle extends Shape
{
	public int length ;
	public int width ;

	public Rectangle(int l, int w)
	{
		length = l ;
		width = w ;
	}
	public void findArea()
	{
		int  area = length * width ;
		System.out.println("Area of Rectangle is :"+area);
	}
}