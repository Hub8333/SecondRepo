class Public 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Start....");
		Public obj=new Public();
		obj.walk();
		obj.swim(); 
		System.out.println("Main End...");
	}
	public void walk()
	{
		System.out.println("move forward");
	}
	public void swim()
	{
		System.out.println("swim across the river");
	}
}
