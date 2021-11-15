class MainClass 
{
	public static void main(String[] args) 
	{
		Circus1 c1 = new Circus1();
		c1.show(new Lion());
		c1.display(new Cat());
		c1.chase(new Dog());
		c1.call(new Animal());
		c1.call(new Lion());
		c1.call(new	Cat());
		c1.call(new Dog());
	}
}
