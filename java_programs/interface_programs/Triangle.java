class Triangle extends Shape
{
	public  double b;
	public double h;

	public Triangle(double b, double h)
	{
		this.b = b;
        this.h = h;
	}
	public void findArea()
	{
		double area = b *h ;
		System.out.println("Area of Triangle is :"+area);
	}
}

