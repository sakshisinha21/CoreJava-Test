//declaring package name
package com.question3;

//import scanner
import java.util.Scanner;

//declaring class name
public class TestMember {

	//main mathod
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		
		//method to enter employes details
		System.out.println("-----------Employee Details-----------");
		
		System.out.println("Enter The Employee's Name: ");
		emp.name = sc.next();
		
		System.out.println("Enter The Employee's Age: ");
		emp.age = sc.nextInt();
		
		System.out.println("Enter The Employee's Phone Number: ");
		emp.PhoneNumber = sc.nextInt();
		
		System.out.println("Enter The Employee's Address: ");
		emp.address = sc.next();
		
		System.out.println("Enter The Employee's Specialization: ");
		emp.Specialization = sc.next();
		
		System.out.println("Enter The Employee's Department: ");
		emp.Department = sc.next();
		
		
		//printing the employee details
		System.out.println("------------Employee Details-----------");
		System.out.println("Name: "+emp.name);
		System.out.println("Age: "+emp.age);
		System.out.println("Phone Number: "+emp.PhoneNumber);
		System.out.print("Salary: ");
		emp.printSalary(900000);
		System.out.println("Specialization: "+emp.Specialization);
		System.out.println("Department: "+emp.Department);
		System.out.println("---------------------------------------");
		
		
		//method to print manager details
		System.out.println("--------Manager Details--------");
		
		Manager mang = new Manager();
		
		
		System.out.println("Enter The Manager's Name: ");
		mang.name = sc.next();
		
		System.out.println("Enter The Manager's Age: ");
		mang.age = sc.nextInt();
		
		System.out.println("Enter The Manager's Phone Number: ");
		mang.PhoneNumber = sc.nextInt();
		
		System.out.println("Enter The Manager's Address: ");
		mang.address = sc.next();
		
		System.out.println("Enter The Manager's Specialization: ");
		mang.Specialization = sc.next();
		
		System.out.println("Enter The Manager's Department: ");
		mang.Department = sc.next();
		
		
		//printing the manager details
		System.out.println("------------Manager Details-----------");
		System.out.println("Name: "+mang.name);
		System.out.println("Age: "+mang.age);
		System.out.println("Phone Number: "+mang.PhoneNumber);
		System.out.print("Salary: ");
		mang.printSalary(1000000);
		System.out.println("Specialization: "+mang.Specialization);
		System.out.println("Department: "+mang.Department);
		System.out.println("--------------------------------------");
		
		
		sc.close();
		
		
		
	//end of method	
	}

}
//end of class