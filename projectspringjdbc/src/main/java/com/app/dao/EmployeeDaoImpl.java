package com.app.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.app.pojo.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
  private JdbcTemplate jt;
  /*public void saverecord() {
              jt.execute("insert into employee values(4040,'kagesh',8500,'kagesh@gmail.com','kagesh')");
	}
public void deleterecord(int empid) {
         jt.update("delete from employee where empid="+empid+" ");	
}*/
/*public List<Employee> retriveAllRecord() {
	           //return  jt.query("select empid,ename,esal,email,password from employee where ename=?",new Object[] {ename},new ResultSetExtractor<List<Employee>>(){
	        	   return  jt.query("select * from employee",new ResultSetExtractor<List<Employee>>(){

				public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
					       List<Employee> listemp=new ArrayList<Employee>();
					       {
					    	   while(rs.next()) {
					    	       Employee e=new Employee();
					    	                e.setEmpid(rs.getInt(1));
					    	                e.setEname(rs.getString(2));
					    	                e.setEsal(rs.getInt(3));
					    	                e.setEmail(rs.getString(4));
					    	                e.setPassword(rs.getString(5));
					    	                listemp.add(e);
					    	   }
					       }
					return listemp;
				}
	        	   
	           });
	    	 
	    
	         
}*/
public Employee getDataRetriveBasedonId(int empid) {
	   return jt.queryForObject("select empid,ename,esal,email,password from employee where empid=?",new Object[] {empid},new MyRowMapper());
}
   private class MyRowMapper implements RowMapper<Employee>
   {

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		    Employee e=new Employee();
		             e.setEmpid(rs.getInt(1));
		             e.setEname(rs.getString(2));
		             e.setEsal(rs.getInt(3));
		             e.setEmail(rs.getString(4));
		             e.setPassword(rs.getString(5));
		return e;
	}
	   
   }
}
