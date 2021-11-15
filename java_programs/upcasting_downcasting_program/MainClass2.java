class MainClass2 
{
	public static void main(String[] args) 
	{
		Q q1 = new Q();
		q1.shoot();
		P p1= (P) new Q();
		p1.shoot();
		Q q2 = (Q) p1;
		q2.shoot();
	}
}
