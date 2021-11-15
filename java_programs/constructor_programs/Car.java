class Car 
{
	public static String brand = "Audi";
	public String series;
	public String colour;
	public int speed;
	public int time;

	public Car(String series,String colour,int speed,int time)
	{
		this.series = series;
		this.colour = colour;
		this.speed = speed;
		this.time = time;
	}


	public void findDistance()
	{
		double distance = speed * time;
		System.out.println(colour+" colour "+brand+" series "+series+" moving @ the speed of "+speed+" km/hr for "+time+" hrs have covered "+distance+" km");
		System.out.println();
	}


	public static void main(String[] args) 
	{
		Car c1 = new Car("A4","Red",240,2);
		Car c2 = new Car("A1","Blue",320,4);
        c1.findDistance();
		c2.findDistance();  
	}
}
