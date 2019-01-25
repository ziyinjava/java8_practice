package com.ziyin.jdk8.defaultMethod;

/**
 * @author ziyin
 @create 2019-01-2019/1/23-7:30
 */
public class MyClass implements MyInterface1,MyInterface2 {
	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		myClass.myMethod();
	}

	@Override
	public void myMethod() {
		MyInterface2.super.myMethod();
	}
}
