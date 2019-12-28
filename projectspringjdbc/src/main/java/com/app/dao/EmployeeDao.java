package com.app.dao;

import java.util.List;

import com.app.pojo.Employee;

public interface EmployeeDao {
  //public void saverecord();
  //public void deleterecord(int empid);
  //public List<Employee> retriveAllRecord(String ename);
 // public List<Employee> retriveAllRecord();
	public Employee getDataRetriveBasedonId(int empid);
}
