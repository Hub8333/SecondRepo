class Circle extends Shape
{
	public static double pi = 3.14;
	public int r;

	public Circle(int r)
	{
		this.r = r;
	}
	public void findArea()
	{
		double area = pi * r * r;
		System.out.println("Area of Circle is :"+area);
	}
}
