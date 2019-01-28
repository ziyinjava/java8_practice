package com.ziyin.jdk8.stream;

import java.util.stream.IntStream;

public class StreamTest8 {
	public static void main(String[] args) {
		//distinct 会等待iterate产生无限流产生的元素, 所以一直运行
//		IntStream.iterate(0,i ->(i+1) % 2).distinct().limit(6).forEach(System.out::println);
		//遇到无限流先限制个数,  注意流的调用顺序,
		IntStream.iterate(0,i ->(i+1) % 2).limit(6).distinct().forEach(System.out::println);
	}
}
