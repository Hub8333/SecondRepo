class Employee 
{
	public String empName;
	public String empEmail;
	public double empSal;
	public static String empCompany = "IBM";
	public static String empJobRole = "Developer";
    public Employee(String empName,String empEmail,double empSal)
	{
		this.empName = empName;
		this.empEmail = empEmail;
		this.empSal = empSal;
	}
	public double findAnnualSalary()
	{
		double annualSalary = empSal *12;
		return annualSalary;
	}
	public void printEmpDetails()
	{
		System.out.println("**********************************************************");
		System.out.println("My name is  "+empName);
        System.out.println("My mail id is "+empEmail);
		System.out.println("Monthly i make "+empSal);
		System.out.println("I work in "+empCompany+" company");
        System.out.println("My job role is "+empJobRole);
		System.out.println("Yearly i earn "+findAnnualSalary());
		System.out.println("**********************************************************");
		System.out.println();
	}
	public static void main(String[] args) 
	{
		Employee e1 = new Employee("Naveen","1998naveennavi@gmail.com",45000.35);
		Employee e2 = new Employee("Shiva","Shiva@ibm.in",55000.35);
		e1.printEmpDetails();
		e2.printEmpDetails();
	}
}
