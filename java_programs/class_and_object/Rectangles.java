class Rectangles 
{
	public int length;
	public double width;
	
    public void printArea()
	{
		double area = length * width;
        System.out.println("**********************************");
		System.out.println("Rectanle of dimension "+length+"x"+width+" is "+area);
		System.out.println("*********************************");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Starts...");
        Rectangles r1 = new Rectangles();
		Rectangles r2 = new Rectangles();
		Rectangles r3 = new Rectangles();
		r1.length = 5;
		r2.length = 7;
		r3.length = 4;
		r1.width = 4.3;
		r2.width = 2.1;
		r3.width = 3.6;
		r1.printArea();
		r2.printArea();
		r3.printArea();
        System.out.println("Main Ends...");
	}
}
