package com.ziyin.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ziyin
 @create 2019-01-2019/1/27-16:26
 */
public class StreamTest12 {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("Hi","Hello","你好");
		List<String> list2 = Arrays.asList("zhangsan","lisi","wangwu");
		list1.stream().flatMap(item -> list2.stream().map(item2 -> item + " " + item2)).collect(Collectors.toList())
				.forEach(System.out::println);

	}
}
