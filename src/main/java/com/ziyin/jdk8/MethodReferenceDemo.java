package com.ziyin.jdk8;

import java.util.Arrays;
import java.util.List;

/**
 * @author ziyin
 @create 2019-01-2019/1/20-22:04
 */
public class MethodReferenceDemo {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("hello","world","hello world");
	//	list.forEach(e -> System.out.println(e));
		list.forEach(System.out::println);
	}
}
