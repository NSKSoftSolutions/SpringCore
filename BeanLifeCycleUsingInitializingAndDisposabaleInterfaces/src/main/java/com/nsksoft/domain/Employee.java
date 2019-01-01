package com.nsksoft.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean, DisposableBean {

	private String empName;
	private String presentAddress;

	public Employee() {
		System.out.println("Employee Object Created");
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getPresentAddress() {
		return presentAddress;
	}

	public void setPresentAddress(String presentAddress) {
		this.presentAddress = presentAddress;
	}

	public void destroy() throws Exception {
		System.out.println("before removing bean object calling destroy() method to closing all connections");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet() method");

	}

}
