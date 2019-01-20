package com.ziyin.jdk8;

/**
 * @author ziyin
 @create 2019-01-2019/1/19-22:48
 */
@FunctionalInterface
 interface MyInterface {
	void test();
	String toString();
}

public class Test2 {
	public void test(MyInterface myInterface) {
		System.out.println(1);
		myInterface.test();
		System.out.println(2);
	}

	public static void main(String[] args) {
		Test2 test2 = new Test2();
		test2.test(() -> System.out.println("test"));
		System.out.println("==================================");
		MyInterface myInterface = () -> System.out.println("hh");
		System.out.println(myInterface.getClass());
		System.out.println(myInterface.getClass().getSuperclass());
		System.out.println(myInterface.getClass().getInterfaces()[0]);


	}
}