package com.ziyin.jdk8.stream;

import java.util.Arrays;
import java.util.List;

/**
 * @author ziyin
 @create 2019-01-2019/1/27-15:29
 */
public class StreamTest10 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("hello","world","hello world");
//		list.stream().mapToInt(item -> item.length()).filter(length -> length == 5).findFirst().ifPresent(System.out::println);
//		list.stream().filter(item -> item.length() == 5).findFirst().ifPresent(System.out::println);

		//流是存在短路计算的,只要满足要求后不会再继续计算
		list.stream().mapToInt(item -> {
			int length = item.length();
			System.out.println(item);
			return length;
		}).filter(length -> length == 5).findFirst().ifPresent(System.out::println);
	}

}
