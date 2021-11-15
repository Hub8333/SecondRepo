class Program4 
{
	public static char a='z';
	public String name="pubg"; 
	public static void main(String[] args) 
	{
		System.out.println(a);
		Program4 p4=new Program4();
        System.out.println(p4.name);
		shoot();
		p4.run();
	}
	public static void shoot()
	{
		String fire ="shoot the enemy";
		System.out.println(fire);
	}
	public void run()
	{
		String run="run along the edges of the zone";
		System.out.println(run);
	}
}
