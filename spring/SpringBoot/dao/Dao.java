package com.dao;

import com.entity.Employee;

public interface Dao {

	public String addEmp(Employee emp); //insert -c
	
	public String updEmp(Employee emp); //update -u
	
	public String delEmp(int empId);  //delete -d
	
	public Employee getEmp(int empId); //select -r
	
}
