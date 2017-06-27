package MyClass;

import java.util.ArrayList;

public class EmployeeClass {


	 private String empName;

	 private int empId;

	 private double empSal;

	 EmployeeClass employees[] = new EmployeeClass[100];

		 

		 public EmployeeClass(String empName,int empId,double empSal){

	         this.empName=empName;

	         this.empId=empId; 

	         this.empSal=empSal;

	      }

		 

		 public String getEmpName(){

			 return empName;

		 }

		

		 public int getEmpId(){

		     return empId;

		 }

		 

		  public double getSalary(){

		     return empSal;

		 }

		 

		public static void main(String[] args) {

		

			ArrayList<EmployeeClass> emp=new ArrayList<EmployeeClass>(); 	

			for (int i = 0; i <= 100; i++) {

				String name="emp" + i;

				int id= i;

				double sal = i+100;

				EmployeeClass employees = new EmployeeClass(name,id,sal);

				emp.add(employees);

			}

			

			for (int i = 0; i < emp.size() ; i++) {

				EmployeeClass employees = (EmployeeClass) emp.get(i);

				System.out.println("Employee " + i +  " name is " + employees.getEmpName());

				System.out.println("Employee " + i +  " id is " + employees.getEmpId());

				System.out.println("Employee " + i +  " sal is " + employees.getSalary());

			    } 

		}

	}

