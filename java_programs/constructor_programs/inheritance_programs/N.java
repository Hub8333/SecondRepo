/* Single level inheritance*/
class N extends M
{
	int k = 100;
	public void move()
	{
		System.out.println("inherited value i : "+i);
		System.out.println("inherited value j : "+j);
        System.out.println("own value k : "+k);
	}
}
