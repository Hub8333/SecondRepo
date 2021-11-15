class MainClass1 
{
	public static void main(String[] args) 
	{
		X x1 =(X) new Y();
		x1.main();

		Y y1 = (Y) x1;
		y1.main();
		y1.main1();

		X x2 = (X) new Z();
		x2.main();

       Z z1 = (Z) x2;
	   z1.main();
	   z1.main2();
	}
}
