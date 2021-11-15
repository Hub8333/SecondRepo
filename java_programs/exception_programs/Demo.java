import java.util.Scanner;
class  Demo
{
	public static void main(String[] args) 
	{
		System.out.println("...MainStarts...");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st Number...");
		int a = scan.nextInt(); /*Dangerous Statement*/
        System.out.println(a);
       System.out.println("Enter 2nd Number...");
	   int b = scan.nextInt();  /*Dangerous Statement*/
	   try
	   {
		System.out.println("Output is : "+a/b);  /*Dangerous Statement*/
	   }
	   catch (ArithmeticException e1)
	   {
		   System.out.println("Denominator cannot be Zero...Re-enter the value...");
		   b = scan.nextInt();
		   try
		   {
			System.out.println("Output is : "+a/b);  /*Dangerous Statement*/
		   }
		   catch (ArithmeticException e2)
		   {
			   System.out.println("Re-attempt Failed...Program will be Terminated...");
		   }
	   }
	   
	   System.out.println("...Main Ends...");
	}
}
