class MainClass 
{
	public static void main(String[] args) 
	{
		Student student1 = new Student(8271,"Naveen",94.7);
		Student student2 = new Student(8171,"Shiva",95);
		Student student3 = new Student(8371,"prashanth",94.7);
		System.out.println( student1.toString());
		System.out.println( student2.toString());
		System.out.println( student3.toString());
        System.out.println(student1.equals(student3));
		 System.out.println(student3.equals(student2));
	}
}
