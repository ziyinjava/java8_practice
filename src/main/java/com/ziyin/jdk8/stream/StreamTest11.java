package com.ziyin.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ziyin
 @create 2019-01-2019/1/27-15:40
 */
public class StreamTest11 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("hello welcome","world hello","hello world hello","hello welcome");
		// map返回的是String数组对数组去重没有意义, 要对每个单词去重,需要使用flatmap
//		list.stream().map(item -> item.split(" ")).distinct().collect(Collectors.toList()).forEach(System.out::println);

		//Stream<String[]> --? Stream<String>
		list.stream().map(item -> item.split(" ")).flatMap(Arrays::stream).distinct().collect(Collectors.toList())
				.forEach(System.out::println);

	}
}
