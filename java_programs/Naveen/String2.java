class String2 
{
	public static void main(String[] args) 
	{
		char[] ch = {'h','e','l','l','o'};
		String str = new String();
		for (int i = 0;i< ch.length;i++)
		{
			str +=ch[i];
		}
		System.out.print(str);
	}
}
