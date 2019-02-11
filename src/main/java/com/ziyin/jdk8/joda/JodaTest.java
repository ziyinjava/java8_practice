package com.ziyin.jdk8.joda;

import org.joda.primitives.list.IntList;
import org.joda.primitives.list.impl.ArrayIntList;

/**
 * @author ziyin
 @create 2019-02-2019/2/11-11:16
 */
public class JodaTest {
	public static void main(String[] args) {
		IntList intList = new ArrayIntList();
		intList.add(1);
		intList.add(2);
		intList.forEach(System.out::println);
	}
}
