class MainClass3 
{
	public static void main(String[] args) 
	{
		System.out.println("Up Casting From O to N");
		N n1 = new O();
		n1.fire();
		n1.run();
		System.out.println("*********************************************");
		System.out.println("Down Casting From N to O");
		O o1 = (O) n1;
		o1.run();
		o1.fire();
		o1.dive();
		System.out.println("*********************************************");
		System.out.println("Up Casting From O to M");
		M m1 = new O();
		m1.run();
		System.out.println("*********************************************");
		System.out.println("Down Castig From M to O");
		O o2 = (O) m1;
		o2.run();
		o2.fire();
		o2.dive();
		System.out.println("*********************************************");
		System.out.println("Up Casting From N to M");
		M m2 = new N();
		m2.run();
		System.out.println("*********************************************");
		System.out.println("DownCasting From M to N");
		N n2 = (N) m2;
		n2.run();
		n2.fire();
	}
}
 