
class Flowers

{
	public Flowers()
	{
		System.out.println("inside flowers");
	}
}
	class Rose extends Flowers
	{
		public Rose()
		{
			super();
            System.out.println("inside rose");
		}
	}
    class Program
	{
	
	    public static void main(String[] args)
	    {
	         Flowers flower = new Rose();
		     Rose rose = (Rose)flower;
		}
   
}
