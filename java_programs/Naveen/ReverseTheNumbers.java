import java.util.Scanner;

class ReverseTheNumbers //adding the numbers 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of Array");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("enter the values...");
		for (int i=0;i<a.length ;i++ )
		{
			a[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i=0;i<a.length ;i++ )
		{
			sum = sum+a[i];
		}
		System.out.println("The Sum Of Array is : "+sum);
	}
}
