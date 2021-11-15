class Circle/*Using class we are creating Blueprint of the circle*/ 
{
	public static double pi = 3.14;/* Declare and initialize  static variable*/ 
	public int radius;/* Only declare non-static variable, dont initialize. Initialize  n-s-v after creating object*/

	public void findArea()
	{
		double areaOfCircle = pi * radius * radius;
		System.out.println("Area of circle is : "+areaOfCircle);
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Starts...");
		Circle c1 = new Circle();
        Circle c2 = new Circle();
	    Circle c3 = new Circle();
		Circle c4 = new Circle();
		c1.radius = 6;
		c2.radius = 3;
		c3.radius = 12;
		c4.radius = 7;
		c1.findArea();
		c2.findArea();
		c3.findArea();
		c4 .findArea();
        System.out.println("Main Ends...");
	}
	
}
