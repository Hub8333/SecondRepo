class MainClass 
{
	public static void main(String[] args) 
	{
		M m1 = new N();
		m1.car();
		System.out.println();
		N n1 = new O();
		n1.car();
		System.out.println();
		M m2 = new O();
		m2.car();
		System.out.println();
		N n2 = (N) m1;
		n2.car();
	}
}
