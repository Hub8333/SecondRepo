class calendar 
{
	private int monthNumber;
	public calendar(int monthNumber)
	{
		if ((monthNumber >=1)&&(monthNumber<=12))
		{
			this.monthNumber  = monthNumber;
		}
		else
		{
			System.out.println("wrong input....");
		}
		System.out.println(monthNumber);
	}
	
}
