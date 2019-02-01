package com.ziyin.jdk8.stream2;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/**
 * @author ziyin
 @create 2019-01-2019/1/31-20:58

 T :流中元素的类型
 Set<T> : 中间结果容器类型
 Set<T> : 返回的结果类型
 */
public class MySetCollector<T> implements Collector<T,Set<T>,Set<T>> {

	@Override
	public Supplier<Set<T>> supplier() {
		System.out.println("supplier invoked");
		return HashSet<T>::new;
	}

	@Override
	public BiConsumer<Set<T>, T> accumulator() {
		System.out.println("accumulator invoked");
		return Set<T>::add; //return (set,item) -> set.add(item);
//		return HashSet<T>::add;  这里不能使用具体类型的add ,因为要兼容supplier返回的具体容器类型
	}

	/**
	 * 将多线程执行的中间结果合并
	 * @return
	 */
	@Override
	public BinaryOperator<Set<T>> combiner() {
		System.out.println("combiner invoked");

		return (set1,set2) -> {
			set1.addAll(set2);
			return set1;
		};
	}

	/**
	 * 如果特性集合里面有IDENTITY_FINISH finisher就不会被调用,所以直接在finisher抛异常即可
	 * @return
	 */
	@Override
	public Function<Set<T>, Set<T>> finisher() {
//		System.out.println("finisher invoked");

	//	return t -> t;
//		return Function.identity();
		throw new UnsupportedOperationException();
	}

	@Override
	public Set<Characteristics> characteristics() {
		System.out.println("characteristics invoked");

		return Collections.unmodifiableSet(EnumSet.of(Characteristics.IDENTITY_FINISH,Characteristics.UNORDERED));
	}

	public static void main(String[] args) {
		List<String> list = Arrays.asList("hello","world","welcomes");
		Set<String> set = list.stream().collect(new MySetCollector<>());
		System.out.println(set);
	}
}
