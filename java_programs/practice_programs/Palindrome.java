class Palindrome 
{
	public static void main(String[] args) 
	{
		String str = "dad";
		String str1 = "";
		for (int i = str.length()-1;i>=0 ;i--)
		{
			str1 += str.charAt(i);
		}
		if (str.equals(str1))
		{
			System.out.println(str+" is palindrome ...");
		}
		else 
			System.out.println(str+" is not a palindrome...");
	}
}
