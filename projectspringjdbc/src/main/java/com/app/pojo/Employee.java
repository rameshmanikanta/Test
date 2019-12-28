package com.app.pojo;

public class Employee {
	private int empid;
	private String ename;
	private int esal;
	private String email;
	private String password;

	public Employee() {
		super();
	}

	public Employee(int empid, String ename, int esal, String email, String password) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.esal = esal;
		this.email = email;
		this.password = password;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
