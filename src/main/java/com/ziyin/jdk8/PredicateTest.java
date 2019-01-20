package com.ziyin.jdk8;

import java.util.function.Predicate;

/**
 * @author ziyin
 @create 2019-01-2019/1/20-15:48
 */
public class PredicateTest {
	public static void main(String[] args) {
		Predicate<String> predicate = p -> p.length() > 5;
		System.out.println(predicate.test("hello"));
	}
}
