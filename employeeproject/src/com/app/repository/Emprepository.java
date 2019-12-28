package com.app.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.pojo.Employee;

public class Emprepository {
	           
        public void EmployeeRepositoryCalled()
        {
        	
        	

        }
        public List<Employee> getAllEmployee() throws ClassNotFoundException, SQLException
        {
        	
        	   List<Employee> elist=new ArrayList<Employee>();
        	   {
        	      Class.forName("oracle.jdbc.driver.OracleDriver");
        	      Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","scott");
        	                 PreparedStatement preparedStatement=connection.prepareStatement("select * from employee");       
        	                                  ResultSet rs=preparedStatement.executeQuery();
        	                                    while(rs.next())
        	                                    {
        	                                        Employee e=new Employee();
        	                                                 e.setEmpid(rs.getInt(1));
        	                                                 e.setEname(rs.getString(2));
        	                                                 e.setEsal(rs.getInt(3));
        	                                                 e.setEcity(rs.getString(4));
        	                                                 elist.add(e);
        	                                    }
        	          }
        	                 
        	                 return elist;
        }
        public Employee getEmployeeBasedOnId(int eid) throws ClassNotFoundException, SQLException
        {
        	Class.forName("oracle.jdbc.driver.OracleDriver");
  	      Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","scott");
  	                 PreparedStatement preparedStatement=connection.prepareStatement("select * from employee where empid="+eid);       
  	                                  ResultSet rs=preparedStatement.executeQuery(); 
  	                                while(rs.next())
                                    {
                                        Employee e=new Employee();
                                                 e.setEmpid(rs.getInt(1));
                                                 e.setEname(rs.getString(2));
                                                 e.setEsal(rs.getInt(3));
                                                 e.setEcity(rs.getString(4));
                                                  return e; 
                                    }
        	         
        	 return null;
        }
        public void updateEmployee(Employee e) throws ClassNotFoundException, SQLException
        {
        	String sql="update employee set ename=?,esal=?,ecity=? where empid=?";
        	Class.forName("oracle.jdbc.driver.OracleDriver");
    	      Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","scott");
                         PreparedStatement st=connection.prepareStatement(sql);
                                    
                                    st.setString(1,e.getEname());
                                    st.setInt(2,e.getEsal());
                                    st.setString(3,e.getEcity());
                                    st.setInt(4,e.getEmpid());
                                    st.executeUpdate();
                                
                                  
                             
        }
        public void SaveRecordInDataBase(Employee e) throws ClassNotFoundException, SQLException
        {
        	Class.forName("oracle.jdbc.driver.OracleDriver");
  	      Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","scott");
          PreparedStatement preparedStatement=connection.prepareStatement("insert into employee values(?,?,?,?)");
                             preparedStatement.setInt(1,e.getEmpid());
                             preparedStatement.setString(2,e.getEname());
                             preparedStatement.setInt(3,e.getEsal());
                             preparedStatement.setString(4,e.getEcity());
                             preparedStatement.executeUpdate();
        }
		public void deleteRecordInDatabase(int eid) throws ClassNotFoundException, SQLException
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
	  	      Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","scott");
	          PreparedStatement preparedStatement=connection.prepareStatement("delete from employee where empid=?");
	                       preparedStatement.setInt(1,eid);
	                       preparedStatement.executeUpdate();
		}
}
