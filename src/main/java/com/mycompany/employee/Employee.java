/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employee;

/**
 *
 * @author alexc
 */
public class Employee 
{
	private String firstName; 
	private String lastName; 
	private double monthlySalary; 
	
	public Employee (String fname, String lname, double msalary)
	{
		firstName = fname;
		lastName = lname;
                monthlySalary = msalary;
		
	
		if (msalary < 0.0)
			monthlySalary = 0.0;
	} 
	
	public void setFirstName (String fname)
	{
		firstName = fname;
		
	} 
	
	public String getFirstName ()
	{
		return firstName;
	} 
	
	
	public void setLastName (String lname)
	{
		lastName = lname;	
	} 
	
	public String getLastName ()
	{
		return lastName;
	} 
	
	public void setMonthlySalary (double msalary)
	{
		monthlySalary = msalary;
		
	} 
	
	public double getMonthlySalary ()
	{
		return monthlySalary;
	} 
	
	public double getYearlySalary()
	{
		double yearlySalary = monthlySalary * 12;
		return yearlySalary;
	} 
	
	public double getRaiseSalary()
	{
		double raise =  monthlySalary * 0.1 ;
		double raiseSalary = ( monthlySalary + raise ) * 12;
		return raiseSalary;
	} 
        /*
        public static void main(String[] args) 
	{
		Employee emp1 = new Employee( "John", "Smith", 2550.00 );
		Employee emp2 = new Employee( "Jane", "Doe", 1400.00 );
		
		System.out.printf( "Yearly salary of %s %s: %.2f\n", emp1.getFirstName(), emp1.getLastName(), emp1.getYearlySalary() );
		System.out.printf( "Yearly salary of %s %s: %.2f\n", emp2.getFirstName(), emp2.getLastName(), emp2.getYearlySalary() );
		
		System.out.println();
		
		System.out.println( "*** Giving 10% raise for each employee ***" );
		System.out.printf( "Yearly salary of %s %s: %.2f\n", emp1.getFirstName(), emp1.getLastName(), emp1.getRaiseSalary() );
		System.out.printf( "Yearly salary of %s %s: %.2f\n", emp2.getFirstName(), emp2.getLastName(), emp2.getRaiseSalary() );
	} 
*/
}  
    

