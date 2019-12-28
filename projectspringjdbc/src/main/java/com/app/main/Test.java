package com.app.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.dao.DemoBean;
import com.app.pojo.Employee;

public class Test {

	public static void main(String[] args) {
ApplicationContext context=new ClassPathXmlApplicationContext("xml/com/app/cfg.xml");
                   DemoBean dd=(DemoBean)context.getBean("demoBean");
                      //dd.insertrecordindatabase();
                      // dd.recorddelete(3030);
                   //List<Employee> listemp=dd.getAllEmployee("ramesh");
                  /* List<Employee> listemp=dd.getAllEmployee();
                        for(Employee e:listemp)
                        {
                        	System.out.println(e.getEmpid()+"  "+e.getEname()+"  "+e.getEsal()+"  "+e.getEmail()+"  "+e.getPassword());
                        }*/
                        Employee e=dd.getAllEmployeeBasedOnId(1010);
                   System.out.println(e.getEmpid()+"  "+e.getEname()+"  "+e.getEsal()+"  "+e.getEmail()+"  "+e.getPassword());
                      System.out.println("done....!!!");
                      
	}

}
