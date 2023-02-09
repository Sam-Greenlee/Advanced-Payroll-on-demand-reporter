//Programmer: Samuel Greenlee
//Program: Java03 Program Assignment
//Description: This program will produce a payroll-on-Demand report
//Date Created On: 2/27/2020

package Business;

public class Hourly extends Employee
{
	//This is the instance variable for this class
	private double numOfHoursWorked;

	//This is the constructor that sets the instance variable
	//This constructor also calls the superclass Employee
	public Hourly()
	{
		super();
		numOfHoursWorked = 0;
	}

	//This is the Constructor that accepts six arguments, and assigns one value into a class variable
	//The other variables are called from the Employee superclass
	//The variables from the superclass Employee were already put into class variables
	public Hourly(int employeeNum, int socialSecurityNumber, String lastName, String firstName, String emailAddress, double numOfHoursWorked)
	{
		super(employeeNum, socialSecurityNumber, lastName, firstName, emailAddress);
		this.numOfHoursWorked = numOfHoursWorked;
	}
	
	//This is the set of getters and setters for the instance variable for this class
	public double getNumOfHoursWorked()
	{
		return numOfHoursWorked;
	}

	public void setNumOfHoursWorked(double numOfHoursWorked)
	{
		this.numOfHoursWorked = numOfHoursWorked;
	}

	//This is the the calcPay method called from the Employee superclass that calculates pay
	@Override
	public double calcPay(double numOfHoursWorked)
	{
		double HOURLY_RATE = 15.95f;
		double pay;
		
		pay = numOfHoursWorked * HOURLY_RATE;
		
		return pay;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
