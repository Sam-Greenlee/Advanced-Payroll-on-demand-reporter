//Programmer: Samuel Greenlee
//Program: Java03 Program Assignment
//Description: This program will produce a payroll-on-Demand report
//Date Created On: 2/27/2020

package Business;

public class Salary extends Employee
{
	//This is the instance variable for this class
	private double yearlySalary;

	//This is the constructor that sets the instance variable
	//This constructor also calls the superclass Employee
	public Salary() 
	{
		super();
		yearlySalary = 0.0d;
	}

	//This is the Constructor that accepts six arguments, and assigns one value into a class variable
	//The other variables are called from the Employee superclass
	//The variables from the superclass Employee were already put into class variables
	public Salary(int employeeNum, int socialSecurityNumber, String lastName,
			String firstName, String emailAddress, double yearlySalary)
	{
		super(employeeNum, socialSecurityNumber, lastName, firstName, emailAddress);
		this.yearlySalary = yearlySalary;
	}
	
	//This is the set of getters and setters for the instance variable for this class
	public double getYearlySalary()
	{
		return yearlySalary;
	}

	public void setYearlySalary(double yearlySalary)
	{
		this.yearlySalary = yearlySalary;
	}

	//This is the the calcPay method called from the Employee superclass that calculates monthlySalary
	@Override
	public double calcPay(double yearlySalary)
	{
		double monthlySalary;
		
		monthlySalary = yearlySalary / 12;
		
		return monthlySalary;
	}

}
