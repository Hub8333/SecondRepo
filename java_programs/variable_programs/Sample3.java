/*WAP to create non static variable of different data type and access to print in main method */
class Sample3 
{
	public String name="Naveen";
	public boolean status=false;
	public static void main(String[] args) 
	{
		Sample3 s1=new Sample3();
		System.out.println(s1.name);
		System.out.println(s1 .status);
	}
}
