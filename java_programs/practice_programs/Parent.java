class Parent 
{
	public static char ch = 'b';
	public int var = 120;

	public char create()
	{
		return ch;
	}
	public static void main(String[] args) 
	{
		Parent parent = new Parent();
		ch = parent.create();
		System.out.println(ch);
	}
}
