/*with in same class, static method can call another  static method directly, coz both the methods are in the same static pool area*/

class Lesson2 
{
	public static void move()
	{
		System.out.println("move fast...");
	}
	public static void walk()
	{
		move();
		System.out.println("walk slow...");
	}
	public static void main(String[] args) 
	{
		walk();
	}
}
