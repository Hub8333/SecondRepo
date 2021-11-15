  /*WAP to create 2 methods.
  method1 : static method with 2 integer local variable, perform addition and return the result.
  method2 : non ststic method with 2 double local variable, perform substraction and return the result.
  Call all the methods from main method, receive the output from the method and perform multiplication using the output and print the multiplication output.*/ 
class Argument2 
{
	public static int add(int a,int b)
	{
        return a+b;
	}
	public double sub(double c,double d)
	{
	
		return c-d;
	}
	public static void main(String[] args) 
	{
		System.out.println("Main start...");
		int a = add(10,100);
		Argument2 a1=new Argument2();
		double b = a1.sub(9.9,1.1);
		double c = a*b;
		System.out.println("multiplication of o/p  is "+c);
		System.out.println("main ends...");
	}
}