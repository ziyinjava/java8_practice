package com.ziyin.jdk8.defaultMethod;

/**
 * @author ziyin
 @create 2019-01-2019/1/23-7:40
 */
public class MyClass2 extends MyInterface1Impl implements MyInterface2 {
	public static void main(String[] args) {
		MyClass2 myClass2 = new MyClass2();
		myClass2.myMethod();  //实现类的优先级比接口高

	}


}
