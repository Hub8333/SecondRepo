class Run3 
{
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		Run1.run();
		Run1 a1 = new Run1();
		a1.run1();
        Run2.main();
		Run2 a2 = new Run2();
		a2.main1();
		System.out.println("main ends...");
	}
}
