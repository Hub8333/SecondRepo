/*WAP to create 1 static and 1 non static method, call the method*/
class Test  
{
	public static void main(String[] args) 
	{
		System.out.println("Main start...");
		flyRocket();
		Test t1=new Test();
		t1.shootBullet();
		System.out.println("Main end...");
	}
	public static void flyRocket()
	{
		System.out.println("Fly In To Sky");
	}
	public void shootBullet()
	{
		System.out.println("Shoot The Enemy"); 
	}
}
