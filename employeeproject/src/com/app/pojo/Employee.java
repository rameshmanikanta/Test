package com.app.pojo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {
	private int empid;
	private String ename;
	private int esal;
	private String ecity;

	public Employee() {
		super();
	}

	public Employee(int empid, String ename, int esal, String ecity) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.esal = esal;
		this.ecity = ecity;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEsal() {
		return esal;
	}

	public void setEsal(int esal) {
		this.esal = esal;
	}

	public String getEcity() {
		return ecity;
	}

	public void setEcity(String ecity) {
		this.ecity = ecity;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", esal=" + esal + ", ecity=" + ecity + "]";
	}
	

}
