package com.ziyin.jdk8.stream;

import java.util.stream.Stream;

/**
 * @author ziyin
 @create 2019-01-2019/1/25-8:10
 */
public class StreamTest6 {
	public static void main(String[] args) {
//		Stream<String> stream = Stream.generate(UUID.randomUUID()::toString);
//		stream.findFirst().ifPresent(System.out::println);

		Stream.iterate(1,item -> item + 2).limit(2).forEach(System.out::println);
	}
}
