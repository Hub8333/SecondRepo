class Main1 
{
	public static void main(String[] args) 
	{
		/* specialized */
		Garden.pull(new Rose());
		Garden.cut(new Lilly ());
		Garden.pluck(new Jasmine());
		/* Generalized */
		Garden.plant(new Rose());
		Garden.plant(new Lilly());
		Garden.plant(new Jasmine());
		Garden.plant(new Flower());
	}
}
 