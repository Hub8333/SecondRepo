/* static members can be accessed through object, coz every object is connected with static pool area*/
class Lesson1
{
	public static int a = 56;

	public static void main(String[] args) 
	{
		Lesson1 d1 = new Lesson1();
		System.out.println(d1.a);
	}
}
