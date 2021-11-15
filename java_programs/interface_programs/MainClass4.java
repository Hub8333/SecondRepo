import java.util.Scanner;

class MainClass4 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("press 1 for Area of Rectangle");
		System.out.println("press 2 for Area of Circle");
		System.out.println("press 3 for Area of Triangle");
		int choice = sc.nextInt();
		if (choice == 1)
		{
			System.out.println("Enter the length");
			int l = sc.nextInt();
			System.out.println("Enter the Width");
			int w = sc.nextInt();
			Draw d1 = new Draw();
			d1.display(new Rectangle(l,w));
		}
		else if (choice == 2)
		{
			System.out.println("Enter the radius");
			int r = sc.nextInt();
			Draw d1 = new Draw();
			d1.display(new Circle(r));
		}
		else if (choice == 3)
		{
			System.out.println("Enter the heigth");
			double h = sc.nextDouble();
			System.out.println("Enter the breadth");
			double b = sc.nextDouble();
			Draw d1 = new Draw();
			d1.display(new Triangle(h,b));
		}
        else 
		{
			System.out.println("Invalid input...");
		}
	}
}
