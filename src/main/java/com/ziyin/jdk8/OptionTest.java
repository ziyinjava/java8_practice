package com.ziyin.jdk8;

import java.util.Optional;

/**
 * @author ziyin
 @create 2019-01-2019/1/20-20:53
 */
public class OptionTest {
	public static void main(String[] args) {
		Optional<String> optional = Optional.empty();
		optional.ifPresent(System.out::println);
		System.out.println("----------------------------");
		System.out.println(optional.orElse("zzz"));
		System.out.println("----------------------------");
	}
}
