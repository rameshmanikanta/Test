package com.app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.pojo.Employee;
@Component
public class DemoBean {
	@Autowired
    private EmployeeDao dao;
	/*public void insertrecordindatabase()
    {
    	dao.saverecord();
    }*/
	/*public void recorddelete(int empid)
	{
		dao.deleterecord(empid);
	}
	public List<Employee> getAllEmployee()
	{
	      return dao.retriveAllRecord();	
	}*/
	public Employee getAllEmployeeBasedOnId(int empid)
	{
		return dao.getDataRetriveBasedonId(empid);
	}
}
