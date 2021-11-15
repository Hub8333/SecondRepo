import java.util.Scanner;
class Demo 
{
	public static void main(String[] args) 
	{
		/* step 1  : create Scanner class object and provide System console location for input data*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name...>");
		String name = scanner.nextLine();/* go to system console and input/read/scan String data and give the data to = */
        System.out.println("Enter your age...>");
		int age = scanner.nextInt();
		System.out.println("Enter your height...>");
		double height = scanner.nextDouble();
		System.out.println("Enter your education completed status...>");
		boolean eduStatus = scanner.nextBoolean();
		System.out.println("Enter your gender M/F...>");
		char gender = scanner.next().charAt(0);
		System.out.println("----------Entered details are-------------");
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Height : "+height);
		System.out.println("Education status : "+eduStatus);
		System.out.println("Gender : "+gender);
	}
}
