class Main 
{
	public static void main(String[] args) 
	{
		Gun gun1 = new Gun("M416",40);
		Gun gun2 = new Gun("M249",100);
		String gun1Output = gun1.toString();
		String gun2Output = gun2.toString();
		System.out.println(gun1Output);
		System.out.println(gun2Output);
		boolean compareOutput = gun1.equals(gun2);
		System.out.println(compareOutput);
	}
}
