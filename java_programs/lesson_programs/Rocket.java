class Rocket 
{
	public int speed;
	public Rocket(int a)
	{
		speed = a;
	}
	public void move()
	{
		/*Non-static method can access non-static variable directly without using THIS keyword.
		   But to improve readability access non-static variable using this keyword.
		   THIS keyword represents current object in execution*/
		System.out.println("Rocket moves @ the speed of  "+this.speed+" km/hr");
	}
	public static void main(String[] args) 
	{
		Rocket r1 = new Rocket(310);
		Rocket r2 = new Rocket(290);
		Rocket r3 = new Rocket(110);
		r1.move();
		r2.move();
		r3.move();
	}
}
