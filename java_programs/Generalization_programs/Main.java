class Main 
{
	public static void main(String[] args) 
	{
		Animal a1 = new Lion();
		a1.test(new Lion());
		a1.test(new Dog());
		a1.test(new Cat());
	}
}
