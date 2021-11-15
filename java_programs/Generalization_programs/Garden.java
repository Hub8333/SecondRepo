class Garden 
{
	public static void pull(Rose r)
	{
		r.attract();
		r.propose();
	}
	public static void cut(Lilly l)
	{
		l.attract();
		l.decorate();
	}
	public static void pluck(Jasmine j)
	{
		j.attract();
		j.pooja();
	}
	public static void plant(Flower f)
	{
		f.attract();
		if(f instanceof Rose)
		{
			Rose r = (Rose)f;
			r.propose();
		}
		else if (f instanceof Jasmine)
		{
			Jasmine j = (Jasmine)f;
			j.pooja();
		}
		else if (f instanceof Lilly)
		{
			Lilly l = (Lilly)f;
			l.decorate();
		}
		else 
		{
			System.out.println("Invalid object");
		}
	}
}
