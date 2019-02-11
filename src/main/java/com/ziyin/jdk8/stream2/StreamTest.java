package com.ziyin.jdk8.stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author ziyin
 @create 2019-02-2019/2/5-22:49
 */
public class StreamTest {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("hello","world","hello world");
		NullPointerException nullPointerException = new NullPointerException("my exception");
		try(Stream<String> stream = list.stream()) {
			stream.onClose(() -> {
				System.out.println("aaa");
				//throw new NullPointerException("first exception");
				//throw nullPointerException;
				throw new NullPointerException();
			}).onClose(() -> {
				System.out.println("bbb");
//				throw new ArithmeticException("second exception");
				throw new NullPointerException();
			}).forEach(System.out::println);
		}
	}
}
