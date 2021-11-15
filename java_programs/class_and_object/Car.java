class Car 
{
	public static String brand = "Audi";
	public String series;
	public String colour;
	public int speed;
	public int time;

	public void findDistance()
	{
		double distance = speed * time;
		System.out.println(colour+" colour "+brand+" series "+series+" moving @ the speed of "+speed+" km/hr for "+time+" hrs have covered "+distance+" km");
	}
	public static void main(String[] args) 
	{
		Car c1 = new Car();
		Car c2 = new Car();
		c1.speed = 240;
		c1.time = 2;
		c1.colour = "red";
		c1.series = "A4";
        c2.speed = 320;
		c2.time = 4;
		c2.colour = "Blue";
		c2.series = "A1";
        c1.findDistance();
		c2.findDistance();
	}
}
  