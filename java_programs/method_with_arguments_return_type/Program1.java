/*WAP to create 3 methods.
  method 1 : static method with 3 diff datatype arguments, print all the arguments.
  method 2 : non static method with 2 same datatype arguments, print all the arguments.
  method 3 : static method with 1 argument of any datatype, print the argument.
  Call alla the methods from main method.

  Q2. WAP to create 2 methods.
  method1 : static method with 2 integer local variable, perform addition and return the result.
  method2 : non ststic method with 2 double local variable, perform substraction and return the result.
  Call all the methods from main method, receive the output from the method and perform multiplication using the output and print the multiplication output.*/ 
class Program1 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Starts...");
		test1(100,"Naveen",true);
		Program1 p1=new Program1();
		p1.test2(9.9,1.1);
		test3('#');
		System.out.println("main ends...");

	}
	public static void test1(int a,String b,boolean c)
	{
		System.out.println("test1 method starts");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("test1 method ends...");
	}
    public void test2(double a,double b)
	{
		System.out.println("test2 method starts...");
		System.out.println(a);
		System.out.println(b);
		System.out.println("test2 method ends...");
	}
	public static void test3(char a)
	{
		System.out.println("test3 method starts...");
		System.out.println(a);
		System.out.println("test3 method ends...");
	}
}
