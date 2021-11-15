class AccessMethod4 
{
	public static void main(String[] args) 
	{
		System.out.println(AccessMethod3.a);
		AccessMethod3 a1 = new AccessMethod3();
		System.out.println(a1.status);
		AccessMethod3.main();
		a1.main1();
	}
}
