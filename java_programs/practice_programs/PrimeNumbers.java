import java.util.Scanner;

class PrimeNumbers 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		System.out.println("The output Is.........");
		boolean isequals = false;
		for (int i = 2;i<=n/2;++i)
		{
			if (n%i==0)
			{
				isequals = true;
			}
		}
		if (isequals==false)
		{
			System.out.print(n+"is a prime number.....");
		}
		else 
			System.out.println(n+"is not a prime number.....");
	}
}
