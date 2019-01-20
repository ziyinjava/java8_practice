package com.ziyin.jdk8;

import java.util.List;

/**
 * @author ziyin
 @create 2019-01-2019/1/20-21:17
 */
public class Company {

	private String name;
	private List<Employee> employees;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
}
