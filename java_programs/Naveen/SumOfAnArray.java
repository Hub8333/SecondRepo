import java.util.Scanner;
class SumOfAnArray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size....");
		int size = sc.nextInt();
		int []a = new int[size];
		int sum = 0;
		System.out.println("Enter the values ....");
		for (int i=0;i<a.length ;i++ )
		{
			a[i] = sc.nextInt();
			sum += a[i];
		}
		System.out.println("The Sum of  Array is :"+sum);
	}
}
