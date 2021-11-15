import java.util.Scanner;

class Swapping 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Value A to swap");
		int a = sc.nextInt();
		System.out.println("Enter the second Value B to Swap");
		int b= sc.nextInt();
		int sum;
		sum = a+b;
		a = sum - a;
		b = sum - b;
		System.out.println("After swapping the value of A = "+a);
		System.out.println("After swapping the value of A = "+b);

	}
}
