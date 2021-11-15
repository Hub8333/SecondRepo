class MergeTwo 
{
	public static void main(String[] args) 
	{
		int first[] = {10,20,50};
		int second[] = {70,80,30};
		int third[] = new int [first.length + second.length];
		System.out.println("============first array=========");
		for (int i = 0;i < first.length; i++)
		{
			System.out.print(first[i]+" ");
		}
		System.out.println("\n========================");
		System.out.println("============second array=========");
		for (int i = 0;i < second.length; i++)
		{
			System.out.print(second[i]+" ");
		}

		int count = 0;
		for (int i = 0; i < first.length; i++)
		{
			third[count] = first[i];
			count++;
		} 
		for (int i = 0; i < second.length; i++)
		{
			third[count] = second[i];
			count++;
		} 
		System.out.println("\n========================");
		System.out.println("============third array=========");
		for (int i = 0;i < third.length;i++)
		{
			System.out.print(third[i]+" ");
		}
	}
}
