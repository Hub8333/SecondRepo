import java.util.Scanner;

class String6 //to check the character is present in the string or not 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String....");
		String str = sc.nextLine();
		System.out.println("Enter The Character To Check....");
		char ch = sc.next().charAt(0);

		boolean isPresent = false;
		int index = 0;
		for (int i = 0;i < str.length() ;i++ )
		{
			if (ch==str.charAt(i))
			{
				isPresent = true;
				index = i;
				break;
			}
		}
		if (isPresent==true)
		{
			System.out.println(ch+" is present in the "+index+" index");
		}
		else 
		{
			System.out.println(ch+" is not present in the string");
		}
	}
}
