  class Circus1 
{
	public void show(Lion l)
	{
		l.move();
		l.hunt();
	}
	public void display(Cat c)
	{
		c.move();
		c.play();
	}
	public void chase(Dog d)
	{
        d.move();
		d.chase();
	}
	public void call(Animal a)
	{
		a.move();
		if (a instanceof Lion)
		{
			Lion l = (Lion)a;
			l.hunt();
		}
		else if (a instanceof Cat)
		{
			Cat c = (Cat)a;
			c.play();
		}
		else if (a instanceof Dog)
		{
			Dog d = (Dog)a;
			d.chase();
		}
		else
		{
			System.out.println("Invalid Object...");
		}
	}
}
