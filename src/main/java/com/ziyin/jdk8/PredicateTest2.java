package com.ziyin.jdk8;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author ziyin
 @create 2019-01-2019/1/20-15:55
 */
public class PredicateTest2 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		PredicateTest2 predicateTest2 = new PredicateTest2();
		predicateTest2.conditionFilter(list,e -> e % 2 == 0);
		System.out.println("=====================================");
		predicateTest2.conditionFilter(list,e -> e % 2 != 0);
		System.out.println("=====================================");
		predicateTest2.conditionFilter(list,e -> e > 5);
		System.out.println("=====================================");
		predicateTest2.conditionFilter(list,e ->true);


		System.out.println("=======================================");

		predicateTest2.conditionFilter2(list,e -> e > 5,e -> e % 2 == 0);

		//predicateTest2.conditionFilter3(list,e -> e > 5,e -> e % 2 == 0);

		System.out.println("=========================");
		System.out.println(predicateTest2.isEqual(new Date()).test(new Date()));
	}


	public void conditionFilter(List<Integer> list,Predicate<Integer> predicate){
		list.forEach(e -> {
			if (predicate.test(e)){
				System.out.println(e);
			}
		});
	}

	public void conditionFilter2(List<Integer> list,Predicate<Integer> predicate,Predicate<Integer> predicate2){
		list.forEach(e -> {
			if (predicate.and(predicate2).negate().test(e)){
				System.out.println(e);
			}
		});
	}

	public Predicate<Date> isEqual(Object obj){
		return Predicate.isEqual(obj);
	}

}


