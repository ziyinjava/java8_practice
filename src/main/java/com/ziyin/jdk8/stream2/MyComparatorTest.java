package com.ziyin.jdk8.stream2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author ziyin
 @create 2019-01-2019/1/30-8:21
 */
public class MyComparatorTest {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("nihao","hello","world","welcome");
		//		Collections.sort(list);
		//Collections.sort(list,(s1,s2) -> s1.length() - s2.length() );
		//		Collections.sort(list,(item1,item2) -> item2.length() -item1.length());

		//		Collections.sort(list, Comparator.comparingInt(String::length).reversed());

		//comparingInt是<? super T>  T的父类类型, 导致编译器推断的时候会可能推断到父类上
		//	Collections.sort(list, Comparator.comparingInt((String item) -> item.length()).reversed());
		//		Collections.sort(list, Comparator.comparingInt((Object item) -> 1).reversed());

//		list.sort(Comparator.comparingInt(String::length).reversed());

		//list.sort(Comparator.comparingInt((String item)-> item.length()).reversed());

		//多级排序,thenComparing 只有当前面的Comparator比较为0的时候才会调用后面的Comparator
//		Collections.sort(list, Comparator.comparingInt(String::length).thenComparing(String.CASE_INSENSITIVE_ORDER));

//		Collections.sort(list,Comparator.comparingInt(String::length).thenComparing((item1,item2) -> item1.toLowerCase().compareTo(item2.toLowerCase())));

		//Collections.sort(list, Comparator.comparingInt(String::length).thenComparing(Comparator.comparing(String::toLowerCase)));

		//Collections.sort(list, Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.comparing(String::toLowerCase,Comparator.reverseOrder())));


		Collections.sort(list,Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.comparing(String::toLowerCase,Comparator.reverseOrder())).thenComparing(Comparator.reverseOrder()));

		System.out.println(list);

		/**
		 * comparingInt,comparingLong,comparingDouble 比较这三种类型的时候,调用具化的方法,避免拆装箱的性能损耗
		 */


	}
}
