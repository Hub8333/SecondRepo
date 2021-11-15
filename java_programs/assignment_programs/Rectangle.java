class Rectangle
{
	public int l;
	public double w;
	public Rectangle(int l,double w)
	{
        this.l = l;
		this.w = w;
	}
	public void printArea()
	{
		double area = this.l * this.w;
        System.out.println("**********************************");
		System.out.println("Rectanle of dimension "+this.l+"x"+this.w+" is "+area);
	}
	public static void main(String[] args) 
	{
		Rectangle r1 = new Rectangle(5,1.2);
		Rectangle r2 = new Rectangle(8,3.4);
        r1.printArea();
		r2.printArea();
	}
}
