class MainClass extends Demo 
{
	public void display()
	{
		System.out.println("abstract method is called");
	}
	public static void main(String[] args)
	{
		MainClass m1 = new MainClass();
		m1.display();
	}
}
