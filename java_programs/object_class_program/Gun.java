class Gun 
{
	public String gName; /* Key feature*/
	public int bullets; /* Comparision feature*/

	public Gun(String gName,int bullets)
	{
		this.gName = gName;
		this.bullets = bullets;
	}

	public String toString()
	{
		return this.gName+" has "+this.bullets+" bullets to fire";
	}

    public boolean equals(Object obj)
	{
		if (obj instanceof Gun)
		{
			Gun gun = (Gun)obj;
			 return this.bullets == gun.bullets;
		}
		else
		{
			return false;
		}
	} 
}
