import java.util.Scanner;
class Run 
{
	public static void main(String[] args) 
	{
		System.out.println("...MainStarts...");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st Number...");
		int a = scan.nextInt(); /*Dangerous Statement*/
       System.out.println("Enter 2nd Number...");
	   int b = scan.nextInt();  /*Dangerous Statement*/
	   for (int chance = 4;chance>=1;chance--)
	   {
		   try
	      {
		     System.out.println("Output is : "+a/b);
		     System.out.println("Division is successful...");
			 break;
	      }
	      catch (ArithmeticException e)
	      {
		   if (chance==1)
		   {
			   System.out.println("Last attempt also failed,Division is un successful so program will be Forcefull terminated");
               break;
		   }
		   else
		   {
			 System.out.println("Denominator cannot be zero...");
             System.out.println("You have "+(chance-1)+" attempts left");
			 System.out.println("Re enter the denominator...");
			 b = scan.nextInt();
		   }
	   }
	}
	System.out.println("...Main Ends...");
 }
}
