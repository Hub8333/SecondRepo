class Demo 
{
	public static void main(String[] args) 
	{
		String s1 = new String("hello");
		String s2 = new String("april");
		String s3 = new String("april");
		System.out.println(s1.toString());
		System.out.println(s2);
		System.out.println(s3);
       	System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
	}
}
