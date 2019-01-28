package com.ziyin.jdk8.stream;

import java.util.Arrays;
import java.util.List;

/**
 * @author ziyin
 @create 2019-01-2019/1/26-17:38
 */
public class StreamTest7 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("hello","world","hello world");

	//	list.stream().map(item -> item.substring(0).toUpperCase() + item.substring(1)).forEach(System.out::println);

		//没有遇到终止操作或者及早求值的时候,中间操作是不会执行的, Stream内部有一个容器,容器存放的是后面施加的n个操作,
		//一旦遇到及早求值和终止操作的时候,所施加的操作会逐个用到每个元素上,循环只有一次
	list.stream().map(item -> {
		String result = item.substring(0,1).toUpperCase() + item.substring(1);
		System.out.println("test");
		return result;
	}).forEach(System.out::println);


	}
}
