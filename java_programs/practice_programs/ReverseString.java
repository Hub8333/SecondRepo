import java.util.Scanner;

class ReverseString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String str = sc.nextLine();
		String str1 = " ";
		for (int i = 0;i<str.length() ;i++)
		{
			str1 = str.charAt(i)+str1;
		}
		System.out.println("The Reverse Of String Is "+str1);
	}
}
