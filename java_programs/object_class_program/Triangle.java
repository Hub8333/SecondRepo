class Triangle 
{
	public int base;
	public double height;

	public Triangle(int base,double height)
	{
		this.base = base;
		this.height = height;
	}

	public double getArea()
	{
		double areaOfTriangle = (this.base * this.height)/2;
		return areaOfTriangle;
	}

	public String toString()
	{
		return "Area Of Triangle is "+this.getArea();
	}

	 public boolean equals(Object obj)
	{
		if (obj instanceof Triangle)
		{
			Triangle triangle = (Triangle)obj;
			return (this.base == triangle.base)&&(this.height == triangle.height);
		}
		else
		{
			/*for ececution purpose*/
			return false;
			/* In future we will remove return false and replace with ecception*/
		}
	}

}
