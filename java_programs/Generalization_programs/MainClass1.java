class MainClass1 
{
	public static void main(String[] args) 
	{
		Demonstrate d1 = new Demonstrate();
		d1.show(new Circle());
		System.out.println();
		d1.display(new Rectangle());
		System.out.println();
		d1.explain(new Triangle());
		System.out.println();
		d1.all(new Circle());
		System.out.println();
		d1.all(new Rectangle());
		System.out.println();
		d1.all(new Triangle());
		System.out.println();
		d1.all(new Shape());
	}
}