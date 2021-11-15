import java.util.Scanner;

class Array 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("enter the numbers");
		for (int i = 0;i<a.length ;i++ )
		{
			a[i] = sc.nextInt();
		}
		System.out.print("--------------the reverse order of array is ----------------");
		System.out.print("\n");
		for (int i = a.length-1;i>=0 ;i-- )
		{
			System.out.print(a[i]+" ");
		}
	}
}
