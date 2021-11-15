/*with in same class, non static method can call another non static method directly, coz both the methods are in the same object*/
class Lesson3 
{
	public void jump()
	{
		System.out.println("jump 5 times...");
	}
	public void sit()
	{
		jump();
		System.out.println("sit on table...");
	}
	public static void main(String[] args) 
	{
		Lesson3 r1 = new Lesson3();
		r1.sit();
	}
}
