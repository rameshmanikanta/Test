package com.app.resource;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.process.internal.RequestScoped;

import com.app.pojo.Employee;
import com.app.repository.Emprepository;

@Path("demo")
public class Employeeresource {
	@GET
	@Produces(MediaType.APPLICATION_XML)
     public List<Employee> getAllEmployee() throws ClassNotFoundException, SQLException
     {
		        Emprepository emp=new Emprepository();
		                      return emp.getAllEmployee();
     }
	@Path("demo32/{id}")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Employee getEmpId(@PathParam("id") int id) throws ClassNotFoundException, SQLException
	{
		Emprepository emp=new Emprepository();	
        return emp.getEmployeeBasedOnId(id);
	}
	//rest/demo/demo3232
	
	@PUT
	@Path("demo3232")
	@Consumes(MediaType.APPLICATION_XML)
	 public void createEmployeeAdded(Employee e) throws ClassNotFoundException, SQLException
	 {
		 Emprepository erep=new Emprepository();
	        erep.updateEmployee(e);
	        
	        System.out.println(e);
	 }
	//rest/demo/insert
	@POST
	@Path("insert")
	@Consumes(MediaType.APPLICATION_XML)
	public void insertRecordInDatabseSource(Employee e) throws ClassNotFoundException, SQLException
	{
	             Emprepository erep=new Emprepository();
	                           erep.SaveRecordInDataBase(e);
	}
	@DELETE
	@POST
	@Path("delete/{eid}")
	@Consumes(MediaType.APPLICATION_XML)

	public void deleterecordresource(@PathParam("eid") int eid) throws ClassNotFoundException, SQLException
	{
		Emprepository erep=new Emprepository();
		             erep.deleteRecordInDatabase(eid);
		             
	}
	
}
