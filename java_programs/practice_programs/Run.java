import java.util.Scanner;
class Run 
{ 
	
	public static void main(String[] args) 
	{
		System.out.println("...MainStarts...");
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter 1st Number...");
	int a = scan.nextInt(); /*Dangerous Statement*/
	int num = a*a;
	   for (int chance = 0;chance<=5;chance++)
		{
		   System.out.println(num);
		}
	}
}

