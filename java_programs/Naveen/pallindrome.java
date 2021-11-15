 
 import java.util.Scanner;

class pallindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String...");
		String str = sc.next();
		String str1 = "";
		for ( int i=0; i<str.length();i++)
		{
			str1 = str.charAt(i)+str1;
		}
		if (str.equals(str1))
		{
			System.out.println(str+" is a palindrome");
		}
		else
			System.out.println(str+" is not a palindrome");
	}
}
