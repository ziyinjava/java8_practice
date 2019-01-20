package com.ziyin.jdk8;

import java.util.function.Supplier;

/**
 * @author ziyin
 @create 2019-01-2019/1/20-17:20
 */
public class StudentTest {
	public static void main(String[] args) {
		Supplier<Student> studentSupplier = () -> new Student();
		System.out.println(studentSupplier.get().getName());
		System.out.println("==============================");
		Supplier<Student> supplier = Student::new;
		System.out.println(supplier.get().getName());
	}
}
