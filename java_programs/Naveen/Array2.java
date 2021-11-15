import java.util.Scanner;
class Array2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size....");
		int size = sc.nextInt();
		int []a = new int[size];
		System.out.println("Enter the values..."); 
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("values are...");
		for(int i =a.length-1; i>=0; i--)
		{
			System.out.print(a[i]+" ");
		}
		
	}
}
