package com.ziyin.jdk8;

import java.util.function.Function;

/**
 * @author ziyin
 @create 2019-01-2019/1/20-12:20
 */
public class FunctionTest {
	public static void main(String[] args) {
		FunctionTest test = new FunctionTest();
		System.out.println(test.compute(1, value -> 2*value));
		System.out.println(test.compute(2, value -> 6+value));
		System.out.println(test.convert(5,value -> String.valueOf(value * value)));
	}

	public int compute(int a,Function<Integer,Integer> function){
		return function.apply(a);
	}


	public String convert(int a,Function<Integer,String> function){
		return function.apply(a);
	}
}
