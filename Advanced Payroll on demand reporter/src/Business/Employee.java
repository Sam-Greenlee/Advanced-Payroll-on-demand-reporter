//Programmer: Samuel Greenlee
//Program: Java03 Program Assignment
//Description: This program will produce a payroll-on-Demand report
//Date Created On: 2/27/2020

package Business;

public abstract class Employee
{
	//These are the instance variables
	private int employeeNum;
	private int socialSecurityNumber;
	private String lastName;
	private String firstName;
	private String emailAddress;
	
	//This is the constructor that sets each instance variable
	public Employee()
	{		
		employeeNum = 0;
		socialSecurityNumber = 0;
		lastName = "";
		firstName = "";
		emailAddress = "";
	}

	//This is the Constructor that accepts five arguments, and assigns those values into class variables
	public Employee(int employeeNum, int socialSecurityNumber, String lastName, String firstName,
			String emailAddress)
	{
		//super();
		this.employeeNum = employeeNum;
		this.socialSecurityNumber = socialSecurityNumber;
		this.lastName = lastName;
		this.firstName = firstName;
		this.emailAddress = emailAddress;
	}
	
	//These are the get and set methods
	public int getEmployeeNum()
	{
		return employeeNum;
	}

	public void setEmployeeNum(int employeeNum)
	{
		this.employeeNum = employeeNum;
	}

	public int getSocialSecurityNumber()
	{
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(int socialSecurityNumber)
	{
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getEmailAddress()
	{
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress)
	{
		this.emailAddress = emailAddress;
	}
	
	//This is the abstract method called calcPay
	public abstract double calcPay(double d);
	
	//This is the overridden toString method that displays
	@Override
	public String toString()
	{
		return "Employee Number:        " + employeeNum + "\n" +
			   "Social Security Number: " + socialSecurityNumber + "\n" +
			   "Last Name:              " + lastName + "\n"+
               "First Name:             " + firstName + "\n"+
			   "Email Address           " + emailAddress + "\n";
	}
}