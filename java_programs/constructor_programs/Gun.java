class Gun 
{
	public String gName;
	public int numberOfBullets;

	public Gun(String i,int j)
	{
		gName = i;
		numberOfBullets = j;
	}

	public void shoot()
	{
		System.out.println(gName+" gun can fire "+numberOfBullets+" bullets");
	}
	public static void main(String[] args) 
	{
		Gun g1= new Gun("pistol",30);
		Gun g2= new Gun("Rifile",110);
		g1.shoot();
		g2.shoot();
		
	}
}
