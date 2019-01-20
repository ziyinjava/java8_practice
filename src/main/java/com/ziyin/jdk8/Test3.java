package com.ziyin.jdk8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ziyin
 @create 2019-01-2019/1/20-7:10
 */
public class Test3 {
	public static void main(String[] args) {
		new Thread(() -> System.out.println("ll")).start();
		List<String> list = Arrays.asList("hello","world","hello world");
		//list.forEach(e -> System.out.println(e.toUpperCase()));
		List<String> list2= new ArrayList<>();
//		list.forEach(e -> list2.add(e.toUpperCase()));
//		list2.forEach(e -> System.out.println(e));

		//list.stream().map(e -> e.toUpperCase()).forEach(e -> System.out.println(e));

		//String::toUpperCase 类::实例方法 第一个参数是调用方法的对象
		list.stream().map(String::toUpperCase).forEach(e -> System.out.println(e));



	}
}
