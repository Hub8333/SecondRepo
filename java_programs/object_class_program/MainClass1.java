class MainClass1 
{
	public static void main(String[] args) 
	{
		Triangle triangle1 = new Triangle(2,5.5);
		Triangle triangle2 = new Triangle(3,3.5);
		Triangle triangle3 = new Triangle(5,5.5);
		Triangle triangle4 = new Triangle(3,3.5);
		Triangle triangle5 = new Triangle(9,5.5);
        System.out.println(triangle1);
		System.out.println(triangle2);
		System.out.println(triangle3);
		System.out.println(triangle4);
		System.out.println(triangle5);
		System.out.println(triangle4.equals(triangle2));
		System.out.println(triangle1.equals(triangle5));
		System.out.println(triangle2.equals(triangle3));
	}
}
