class Student 
{
	public int studentId;
	public String studentName;
	public double studentPercentage;

	public Student(int studentId,String studentName,double studentPercentage)
	{
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentPercentage = studentPercentage;
	}

	public String toString()
	{
		return "student name is "+this.studentName+" with id "+this.studentId+" and having percentage of "+this.studentPercentage;
	} 

	public boolean equals(Object obj)
	{
		if (obj instanceof Student)
		{
			Student  student = (Student)obj;
			return this.studentPercentage ==student.studentPercentage;
		}
		else
		{
			return false; /* throw an exception */
		}
	}
}
