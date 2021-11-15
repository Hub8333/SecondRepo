import java.util.Scanner;
class MainClass2 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Press 1 for Dog Sound...");
		System.out.println("Press 2 for Lion Sound...");
		System.out.println("Press 3 for Cat Sound...");
		int choice = scan.nextInt();
		if (choice==1)
		{
			Circus.makeSound(new Dog());
		}
		else if (choice==2)
		{
			Circus.makeSound(new Lion());
		}
		else if (choice==3)
		{
			Circus.makeSound(new Cat());
		}
		else
		{
			System.out.println("invalid choice...");
		}
	}
}
 