package com.ziyin.jdk8;

/**
 * @author ziyin
 @create 2019-01-2019/1/20-17:19
 */
public class Student {

	private String name = "zz";

	private int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Student() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
