import java.util.Scanner;

class DuplicatesPresentInAString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String :");
		String str = sc.next();
		String str1 ="";
		for (int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if (str1.indexOf(ch)==-1)
			{
				str1 += ch;
			}
		}
		System.out.println("with duplicates the output is ---- "+str);
		System.out.println("without duplicates the output is ---- "+str1);

	}
}
