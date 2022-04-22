package com.service;

import java.util.ArrayList;
import java.util.List;

import com.bean.Employee;
import com.dao.EmployeeDao;

public class EmployeeService {
	public String sayHello(String name){
		return "welcome to JUnit 5 testing" +name;
	}
	public String checkUser(String name, String pass) {
		if(name.equals("Siddu") && pass.equals("123")){
			return "success";
		}else {
			return "failure";
		}
	}
	public float updateSalary(Employee emp) {
		if(emp.getDesg().equals("Manager")){
			return emp.getSalary()+5000;
		}else if(emp.getDesg().equals("Programmer")) {
			return emp.getSalary()+3000;
		}else {
			return emp.getSalary();
		}
				
	}
	public Employee getEmployeeInfo() {
		Employee emp=new Employee(1,"Ravi",150000,"Tester");
		return emp;
		
	}
	public List<Employee> getEmployeeDetails(){
		Employee emp1=new Employee(100,"Siddu",18000,"Programmer");
		Employee emp2=new Employee(101,"Ravi",15000,"Manager");
		Employee emp3=new Employee(102,"Raju",18000,"Programmer");
		List<Employee> listOfemp=new ArrayList<Employee>();
		listOfemp.add(emp1);
		listOfemp.add(emp2);
		listOfemp.add(emp3);
		return listOfemp;
	}
	EmployeeDao ed=new EmployeeDao();
	public List<Employee> getEmployeeDataFromDb(){
		return ed.getAllEmployeeDetails();
	}
	
	public String storeRecord(Employee emp) {
		if(ed.storeEmployeeDetails(emp)>0) {
			return "Record inserted";
		}else {
			return "Record didn't insert";
		}
	}
}
