import java.util.Scanner;

class SquaresOfNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		System.out.println("The output Is.........");
		for (int i=1;i<=n ;i++ )
		{
			System.out.print(i+" ");
			if (i%3==0)
			{
				System.out.println("\n");
			}
		}
	}
}
