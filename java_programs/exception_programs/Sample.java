 import java.util.Scanner;
class Sample 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name");
		String s1 = scan.nextLine();
	    System.out.println("Give index number: ");
		int i = scan.nextInt();
		for (int length=5;length>=1;length--)
		{
			try
			{
				System.out.println("The output is "+s1.charAt(i));
				break;
			}
			catch (StringIndexOutOfBoundsException e)
			{
				if (length==1 )
				{
					System.out.println("Last attempt also failed,program will be Forcefull terminated");
					break;
				}
				else
				{
					System.out.println("index value out of range...");
					System.out.println("You have "+(length-1)+" attempts left");
					System.out.println("re-enter the index value");
					i = scan.nextInt();
				}
			}
		}
		System.out.println("main ends...");
	}
}
