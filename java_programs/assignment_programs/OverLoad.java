class OverLoad 
{
	public static void add(int i,double j)
	{
		System.out.println("walk for "+i+" kms and run for "+j+" kms");
	}
	public void add(String i,char j)
	{
		System.out.println(i+j);
	}
	public static void main(String[] args) 
	{
		add(10,1.1);
		OverLoad obj=new OverLoad();
		obj.add("naveen",'*');
	}
}
