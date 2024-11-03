package com.example.restservice; 

import org.springframework 
	.stereotype 
	.Repository; 

// Importing the employees class to 
// use the defined properties 
// in this class 
import com.example.restservice.Employees; 

@Repository

// Class to create a list 
// of employees 
public class EmployeeDAO { 

	private static Employees list 
		= new Employees(); 

	// This static block is executed 
	// before executing the main 
	// block 
	static
	{ 

		// Creating a few employees 
		// and adding them to the list 
		list.getEmployeeList().add( 
			new Employee( 
				1, 
				"JOhn", 
				"Smith", 
				"johnsmith@gmail.com",
				"Mister")); 

		list.getEmployeeList().add( 
			new Employee( 
				2, "Adekunle", 
				"blessing", 
				"abc@gmail.com",
				"Miss")); 

		list.getEmployeeList().add( 
			new Employee( 
				3, "Ritesh", 
				"Richard", 
				"ririchard@gmail.com",
				"Master")); 

		  
	} 

	// Method to return the list 
	public Employees getAllEmployees() 
	{ 

		return list; 
	} 

	  
		// Method to add an employee 
		// to the employees list 
		public void
		addEmployee(Employee employee) 
	{ 
		list.getEmployeeList() 
			.add(employee); 
		  
	} 
} 
