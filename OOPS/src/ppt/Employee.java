package ppt;


	public class Employee 

	{

	//variables or data

	private int employeeId;

	private String employeeName;

	private double employeeSalary;

	private String employeeAddress;

	//initialization of blocks

	//default or zero-parameterized constructor

	public Employee() 

	{

	employeeId = 3030;

	employeeName = "Swarupa Patil";

	employeeSalary = 69585.50;

	employeeAddress = "Shivaji Nagar, Pune";

	}

	//parameterized constructor

	public Employee(int employeeId, String employeeName, double employeeSalary, String employeeAddress) 

	{

	this.employeeId = employeeId;

	this.employeeName = employeeName;

	this.employeeSalary = employeeSalary;

	this.employeeAddress = employeeAddress;

	}

	 

	//Service method

	public void getEmployee() 

	{

	System.out.println("Employee Id: "+employeeId);

	System.out.println("Employee Name: "+employeeName);

	System.out.println("Employee Salary: "+employeeSalary);

	System.out.println("Employee Address: "+employeeAddress);

	 

	}

	public static void main(String[] args) 

	{

	//Employee object with default constructor

	Employee employee1 = new Employee();

	employee1.getEmployee();

	System.out.println("—————————————");
//
//	Employee employee2 = new Employee();
//
//	employee2.getEmployee();

	System.out.println("=======================================");

	//Employee object with parameterized constructor

	Employee employee3 = new Employee(2121, "Devi", 60543.40, "Nampally, Hyderabad");

	employee3.getEmployee();

	System.out.println("—————————————");

	Employee employee4 = new Employee(5656, "Sowmya", 54343.40, "SR Nagar, Hyderabad");

	employee4.getEmployee();

	}
}
