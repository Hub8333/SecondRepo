class Demonstrate 
{
	public void show(Circle c)
	{
		c.fillColour();
		c.rotate();
		c.animate();
	}
	public void display(Rectangle r)
	{
		r.removeColour();
		r.rotate();
		r.animate();
	}
	public void explain(Triangle t)
	{
       t.updateColour();
	   t.rotate();
	   t.animate();
	}
	public void all(Shape s)
	{
		s.rotate();
		s.animate();
		if (s instanceof Circle)
		{
			Circle c1 = (Circle)s;
			c1.fillColour();
		}
		else if (s instanceof Rectangle)
		{
			Rectangle r1 = (Rectangle)s;
			r1.removeColour();
		}
		else if (s instanceof Triangle)
		{
			Triangle t1 = (Triangle)s;
			t1.updateColour();
		}
		else 
		{
			System.out.println("Invalid Object");
		}
	}
}
