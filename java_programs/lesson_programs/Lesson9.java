class Lesson9 
{
	public Lesson9(int i)
	{
		System.out.println("In test method of int arg i :"+i);
	}
	public Lesson9(double j)
	{
		System.out.println("In test method of int arg j :"+j);
	}
	public Lesson9(String y,boolean z)
	{
		System.out.println("In test method of int arg y :"+y);
        System.out.println("In test method of int arg z :"+z);
	}
	public static void main(String[] args) 
	{
		Lesson9 test1 = new Lesson9("Hi",true);
		Lesson9 test2 = new Lesson9(67);
		Lesson9 test3 = new Lesson9(8.3);
	}
}
