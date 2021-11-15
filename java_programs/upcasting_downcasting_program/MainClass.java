class MainClass 
{
	public static void main(String[] args) 
	{
		Developer d1 = (Developer)new Mother ();//upcasting
		d1.work();
		Mother m1 = (Mother )d1;//downcasting
		m1.cook();
		m1.work();
	}
}
