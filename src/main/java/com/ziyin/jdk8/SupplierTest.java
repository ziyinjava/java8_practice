package com.ziyin.jdk8;

import java.util.function.Supplier;

/**
 * @author ziyin
 @create 2019-01-2019/1/20-17:17
 */
public class SupplierTest {
	public static void main(String[] args) {
		Supplier supplier = () -> "hello world";
		System.out.println(supplier.get());
	}
}
