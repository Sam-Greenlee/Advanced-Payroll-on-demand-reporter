//Programmer: Samuel Greenlee
//Program: Java03 Program Assignment
//Description: This program will produce a payroll-on-Demand report
//Date Created On: 2/27/2020

package Presentation;

import java.util.Scanner;

//This imports the Employee class you so can pass validated variables to it
import Business.Employee;

//This imports the Hourly class so you can make it an object in this class
import Business.Hourly;

//This imports the Salary class so you can make it an object in this class
import Business.Salary;

public class Presentation
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		Hourly hourly = new Hourly();//Instantiates the  Hourly object
		Salary salary = new Salary();//Instantiates Salary object
		
		String answer = "";
		
		//Continues until the user enters anything besides "y"
		do
		{	
			
		//Passes the objects of hourly and salary to each method
		checkEmployeeNumber(hourly,sc); 
		checkSocialSecurityNumber(hourly,sc);
		checkLastName(hourly,sc);
		checkFirstName(hourly,sc);
		checkEmailAddress(hourly,sc);
		
		//This chunk of code asks if the employee is a hourly or salary employee
		//It will then configure the data based on what the employee is
		//**********************************************************************************************
		System.out.print("Are you an hourly employee or a salary employee? " + "Y for hourly, " + "otherwise enter " +  "N:\n");
		String empAnswer = sc.nextLine();
		String payDisplay;

		if(empAnswer.equalsIgnoreCase("Y"))
		{
			checkHourly(hourly,sc);
			payDisplay = Validation.formatAndRound(hourly.calcPay(hourly.getNumOfHoursWorked()));
		}
		else
		{
			checkSalary(salary,sc);
			//payDisplay = salary.calcPay(salary.getYearlySalary());
			payDisplay = Validation.formatAndRound(salary.calcPay(salary.getYearlySalary()));
		}
		//******************************************************************************************************
		
		//This displays the overridden toString() method
		String display = hourly.toString();
				
		System.out.print(display);
				
		System.out.print("Here is the amount you take home: " + payDisplay + "\n");
		
		//Statement that asks the user if her or she wants to continue
	 	System.out.print("Would you like to calculate pay for another employee? ");
	 	
	 	answer = sc.next();
	 	
     	sc.nextLine();
				
		//Continues until the user enters anything besides "y"
	 	}while(answer.equalsIgnoreCase("y"));  
	}
		
	//This method gets the employee number, and then checks it	
	public static void checkEmployeeNumber(Employee Employee, Scanner sc)
	{
		 String employeeNum = "";
		 int min = 1000;
		 int max = 9999;
		 boolean errorCheck = false;
		 
		 do
		 	{   
	  	 		System.out.print("Employee number: ");
	  	 		employeeNum = sc.nextLine();
	  	 		errorCheck = Validation.isInteger(employeeNum, "Employee number")&&  
			     		     Validation.isWithinRangeInteger(employeeNum, min, max,"Employee number");
			
		 	}while(!errorCheck);
		 
		 	Employee.setEmployeeNum(Integer.parseInt(employeeNum));
	}
	
	//This method gets the social security number, and then checks it
	public static void checkSocialSecurityNumber(Employee Employee, Scanner sc)
	{
		String socialSecurityNumber = "";
		int min = 111111111;
		int max = 999999999;
		boolean errorCheck = false;
		
		do
	 	{
			System.out.print("Social security number: ");
			socialSecurityNumber = sc.nextLine();
 	 		errorCheck = Validation.isInteger(socialSecurityNumber, "Social security number")&&  
 	 					 Validation.isWithinRangeInteger(socialSecurityNumber, min, max,"Social security number");
		
	 	}while(!errorCheck);
		
		Employee.setSocialSecurityNumber(Integer.parseInt(socialSecurityNumber));
	}
	
	//This method gets the employee's last name, and then checks it
	public static void checkLastName(Employee Employee, Scanner sc)
	{
		String lastName = "";
		boolean errorCheck = false;
			
			do
	  		{
	 			System.out.print("Last name: ");
	 			lastName = sc.nextLine();
	 			errorCheck = Validation.isStringPresent(lastName, "Last name");

	 		
	  		}while(!errorCheck);

			Employee.setLastName(lastName);
	}
	
	//This method gets the employee's first name, and then checks it
	public static void checkFirstName(Employee Employee, Scanner sc)
	{
		String firstName = "";
		boolean errorCheck = false;
			
			do
	  		{
	 			System.out.print("First name: ");
	 			firstName = sc.nextLine();
	 			errorCheck = Validation.isStringPresent(firstName, "First name");

	 		
	  		}while(!errorCheck);

			Employee.setFirstName(firstName);
	}
	
	//This method gets the employee's email address and then checks it
	public static void checkEmailAddress(Employee Employee, Scanner sc)
	{
		String emailAddress = "";
		boolean errorCheck = false;
			
			do
	  		{
	 			System.out.print("Email address: ");
	 			emailAddress = sc.nextLine();
	 			errorCheck = Validation.isStringPresent(emailAddress, "Email address");

	 		
	  		}while(!errorCheck);

			Employee.setEmailAddress(emailAddress);
	}
	
	//These are the methods that check weather the employee is a hourly or salary employee
	
	//This is the method that checks the hourly data
	public static void checkHourly(Hourly hourly, Scanner sc)
	{
		String numOfHoursWorked = "";
		int min = 1;
		int max = 40;
		boolean errorCheck = false;
		
		do
	 	{
			System.out.print("Hours worked: ");
			numOfHoursWorked = sc.nextLine();
 	 		errorCheck = Validation.isDouble(numOfHoursWorked, "Hours worked")&&  
 	 					 Validation.isWithinRangeDouble(numOfHoursWorked, min, max,"Hour worked");
		
	 	}while(!errorCheck);
		
		hourly.setNumOfHoursWorked(Double.parseDouble(numOfHoursWorked));
	}
	
	//This is the method that checks the Salary data
	public static void checkSalary(Salary salary, Scanner sc)
	{
		String yearlySalary = "";
		int min = 12000;
		int max = 125000;
		boolean errorCheck = false;
		
		do
	 	{
			System.out.print("Salary pay: ");
			yearlySalary = sc.nextLine();
 	 		errorCheck = Validation.isDouble(yearlySalary, "Salary pay")&&  
 	 					 Validation.isWithinRangeDouble(yearlySalary, min, max,"Salary pay");
		
	 	}while(!errorCheck);
		
		salary.setYearlySalary(Double.parseDouble(yearlySalary));
	}
	
}
