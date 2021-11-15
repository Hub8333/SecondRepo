/*WAP to create 2 methods.
  method1 : static method with 2 integer local variable, perform addition and return the result.
  method2 : non ststic method with 2 double local variable, perform substraction and return the result.
  Call all the methods from main method, receive the output from the method and perform multiplication using the output and print the multiplication output.*/ 
class Q2 
{
	public static int add()
	{
		
		int a = 10;
		int b = 100;
		int c = a+b;
	
		return c;
	}
	public double sub()
	{
         
		double d = 9.9;
		double e = 1.1;
		double f = d-e;

		return f;
		
	}
	public static void main(String[] args) 
	{
		System.out.println("Start Main...");
		int g = add();
        Q2 obj = new Q2();
		double h = obj.sub();
		double i=g*h;
		System.out.println(i);
		System.out.println("Main Ends...");
	}
}
