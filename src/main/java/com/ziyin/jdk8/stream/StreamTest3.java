package com.ziyin.jdk8.stream;

import java.util.Arrays;
import java.util.List;

/**
 * @author ziyin
 @create 2019-01-2019/1/23-19:47
 */
public class StreamTest3 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		System.out.println(list.stream().map(i -> 2 * i).reduce(0,Integer::sum));
	}
}
