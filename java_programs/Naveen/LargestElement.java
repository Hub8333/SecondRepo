import java.util.Scanner;

class LargestElement
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size....");
		int size = sc.nextInt();
		int []a = new int[size];
		int sum =1 ;
		System.out.println("Enter the values ....");
		for (int i=0;i<a.length ;i++ )
		{
			a[i] = sc.nextInt();
		}
		int largest = a[0];
		for (int i= 1;i<a.length ;i++ )
		{
			if (largest < a[i])
			{
				largest = a[i];
			}
		}
		System.out.println("The Largest Number of  Array is :"+largest);
	}
}
