/*
 * Program:- The management of LearnMore University is planning to automate the University management
 *           system. Therefore, Steve Wilkinson, the programmer, has decided to create a Java program
 *           that accepts the student details, such as the first name, last name, age, course enrolled,
 *           and student ID. In addition, he also needs to accept the employee details, such as first
 *           name, last name, age, salary, department name, designation, and employee ID. Steve must
 *           ensure the reusability of code. The program must offer a choice to accept either the
 *           student’s or employee’s details. Help Steve to develop the program.
 * @Author:- SAKSHI PRIYA
 * @Date:- 24-Nov-2022
 */

//declaring package name
package com.question1;

//import scanner
import java.util.Scanner;

//creating class name
public class LearnMore {

		//declaring variables
		private int stu_id, stu_age, emp_id, emp_age;
		private String stu_fname, stu_lname, stu_course, emp_fname, emp_lname, emp_dept , emp_designation;
		private float emp_salary;
		static Scanner sc = new Scanner (System.in);
		
		
		//method to enter student details
		public void enterStudentDetails()
		{

			
			System.out.println("--------Student Details--------");
			
			System.out.println("Enter The Student's First Name:");
			stu_fname = sc.next();
			
			System.out.println("Enter The Student's Last Name:");
			stu_lname = sc.next();
			
			System.out.println("Enter The Student's ID:");
			stu_id = sc.nextInt();
			
			System.out.println("Enter The Student's Age:");
			stu_age = sc.nextInt();
			
			System.out.println("Enter The Student's Course:");
			stu_course = sc.next();
			
			
			//printing student details
			System.out.println("----------STUDENT DETAILS----------");
			System.out.println("Name: "+stu_fname+" "+stu_lname);
			System.out.println("Student ID: "+stu_id);
			System.out.println("Student Age: "+stu_age);
			System.out.println("Student Course: "+stu_course);
			System.out.println("-----------------------------------");
			
			
		}
		
		//method to enter employee details
		public void enterEmployeeDetails()
		
		{
			
			System.out.println("--------Employee Details--------");
			
			System.out.println("Enter The Employee's First Name:");
			emp_fname = sc.next();
			
			System.out.println("Enter The Employee's Last Name:");
			emp_lname = sc.next();
			
			System.out.println("Enter The Employee's ID:");
			emp_id = sc.nextInt();
			
			System.out.println("Enter The Employee's Age:");
			emp_age = sc.nextInt();
			
			System.out.println("Enter The Employee's Department:");
			emp_dept = sc.next();
			
			System.out.println("Enter The Employee's Salary:");
			emp_salary = sc.nextFloat();
			
			System.out.println("Enter The Employee's Designation:");
			emp_designation = sc.next();
		
			
			//printing the employee details
			System.out.println("----------EMPLOYEE DETAILS----------");
			System.out.println("Name: "+emp_fname+" "+emp_lname);
			System.out.println("Employee ID: "+emp_id);
			System.out.println("Employee Age: "+emp_age);
			System.out.println("Employee Department: "+emp_dept);
			System.out.println("Employee Salary: "+emp_salary);
			System.out.println("Employee Designation: "+emp_designation);
			System.out.println("------------------------------------");
			
			
		}

		public static void main(String[] args) {
			LearnMore obj = new LearnMore(); //create object of the class
			System.out.println("---****---LEARNMORE UNIVERSITY---****---\n");
			
			
			int ch=0;	
			System.out.println("Choose Any One To Entering Details:");
			System.out.println("1: Student\n2: Employee");
			ch = sc.nextInt();
				
				
			switch(ch)
			{
			case 1: 
			{
				obj.enterStudentDetails();
				break;
			}
			case 2:
			{
				obj.enterEmployeeDetails();
				break;
			}
			default:
				System.out.println("Invalid Cholice");
			}
			
			
			
			
		//end of method	
		}
		
//end of class		
}
