package com.ziyin.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author ziyin
 @create 2019-01-2019/1/23-8:11
 */
public class StreamTest1 {

	public static void main(String[] args) {
		Stream stream1 = Stream.of("hello","world","hello world");
		String[] myArray = new String[]{"hello","world","hello world"};
		Stream stream2 = Stream.of(myArray);
		Stream stream3 =Arrays.stream(myArray);
		List<String> list = Arrays.asList(myArray);
		Stream<String> stream4 = list.stream();

	}
}
