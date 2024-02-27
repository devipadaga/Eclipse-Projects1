package ppt;

public class Address 
{

//variables

private String city;

private String state;

private String country;

	//constructors

 Address() 
	{

city = "Hyderabad";

state = "Telangana State";

country = "India";

}

//method of Address class

public void getData()

{

System.out.println("Employee City: "+city);

System.out.println("Employee State: "+state);

System.out.println("Employee Country: "+country);

}


class Employee extends Address

{

	private int employeeId;

	private String employeeName;

	private double employeeSalary;

	//default or zero-parameterized constructor
	Employee() 

	{

	employeeId = 3030;

	employeeName = "Devi";

	employeeSalary = 69585.50;

	}

	//Overridden method from Address class

	public void getData() 

	{

	System.out.println("Employee Id: "+employeeId);

	System.out.println("Employee Name: "+employeeName);

	System.out.println("Employee Salary: "+employeeSalary);

	}
	
	
	public static void main(String[] args) 

	{
		Address address = new Address();

		address.getData();
		System.out.println("**********************");

	
	
	}
	

	}
}



	




