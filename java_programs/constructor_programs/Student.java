class Student 
{
	public static String javaTrainerName = "sunil";
	public String name;
	public char gender;
	public String stream;
	public int yop;
	public double tenth;
	public double inter;
	public double degree;

	public Student(String a,char b,String c,int d,double e,double f,double g)
	{
		name = a;
		gender = b;
		stream = c;
		yop = d;
		tenth = e;
		inter = f;
		degree = g;
	}
	
	public void printAllInfo()
	{
		System.out.println("My Name is "+name+" with gender "+gender+" of "+stream+" department and passed out in the year "+yop+"  My 10th precentage is "+tenth+" and inter percentage is "+inter+" and degree percentage is "+degree+" My java trainer name is "+javaTrainerName);
	    System.out.println();
		System.out.println();
	}
	public static void main(String[] args) 
	{
		Student s1 = new Student("naveen",'M',"MECH",2020,95,94,71);
		Student s2 = new Student("Shivani",'f',"CSE",2020,95,93,75);
		Student s3 = new Student("Shiva",'M',"EEE",2020,100,100,80);
		s1.printAllInfo();
		s2.printAllInfo();
		s3.printAllInfo();
	}
}
