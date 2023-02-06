/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employee;

/**
 *
 * @author alexc
 */
public class EmployeeTest {
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
}
