import java.util.Scanner;
class Sample2
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name");
		String s1 = scan.nextLine();
	    System.out.println("Give index number: ");
		int i = scan.nextInt();
		for (int length=1;length>0;length++)
		{
			try
			{
				System.out.println("The output is "+s1.charAt(i));
				break;
			}
			catch (StringIndexOutOfBoundsException e)
			{
				if (length==0 )
				{
					System.out.println("Last attempt also failed,program will be Forcefull terminated");
					break;
				}
				else
				{
					System.out.println("index value out of range...");
					System.out.println("re-enter the index value");
					i = scan.nextInt();
				}
			}
		}
		System.out.println("main ends...");
	}
}

