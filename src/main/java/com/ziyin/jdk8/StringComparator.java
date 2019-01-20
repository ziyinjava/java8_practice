package com.ziyin.jdk8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author ziyin
 @create 2019-01-2019/1/20-10:03
 */
public class StringComparator {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("achar","boo","zoo");
		//Collections.sort(names,(o1,o2) -> o2.compareTo(o1));
		Collections.reverse(names);
		System.out.println(names);
	}
}
