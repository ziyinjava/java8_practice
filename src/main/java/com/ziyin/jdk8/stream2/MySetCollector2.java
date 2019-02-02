package com.ziyin.jdk8.stream2;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/** *     A a1 = supplier.get();
 *     accumulator.accept(a1, t1);
 *     accumulator.accept(a1, t2);
 *     R r1 = finisher.apply(a1);  // result without splitting
 *
 *     A a2 = supplier.get();
 *     accumulator.accept(a2, t1);
 *     A a3 = supplier.get();
 *     accumulator.accept(a3, t2);
 *     R r2 = finisher.apply(combiner.apply(a2, a3));  // result with splitting
 * @author ziyin
 @create 2019-02-2019/2/1-7:07
 */
public class MySetCollector2<T> implements Collector<T,Set<T>,Map<T,T>> {
	/**
	 * 提供中间结果容器
	 * @return
	 */
	@Override
	public Supplier<Set<T>> supplier() {
		System.out.println("supplier invoked");
		return () -> {
			System.out.println("-------------");
			return new HashSet<>();
		};
	}

	/**
	 * 如果是Characteristics.CONCURRENT 情况下, accumulator中不要对中间结果容器做额外的操作,因为在多线程情况下,多个线程对一个中间结果容器操作容易出现并发修改异常
	 * @return
	 */
	@Override
	public BiConsumer<Set<T>, T> accumulator() {
		System.out.println("accumulator invoked");
		return (set,item) -> {
			System.out.println("accumulator: " + set + Thread.currentThread().getName());
			set.add(item);
		};
	}

	/**
	 * combiner只有在并行流并且没有Characteristics.CONCURRENT特性的情况下会被调用,串行流并不会调用combiner,
	 * 因为串行流只有一个线程执行所有任务,没有合并的需要, Characteristics.CONCURRENT是指只有一个中间结果容器,所以直接返回中间结果容器即可不用合并,
	 * 如果不加Characteristics.CONCURRENT,则会有多个中间结果容器需要进行合并
	 *  BinaryOperator<T> extends BiFunction<T,T,T> 输入输出是一样的类型,因为合并之后一定是相同类型的,
	 * @return
	 */
	@Override
	public BinaryOperator<Set<T>> combiner() {
		System.out.println("accumulator invoked");
		return (set1,set2) -> {
			System.out.println("set1: " + set1);
			System.out.println("set2: " + set2);
			set1.addAll(set2);
			return set1;
		};
	}

	@Override
	public Function<Set<T>, Map<T, T>> finisher() {
		System.out.println("finisher invoked");
		return set -> {
			Map<T, T> map = new HashMap(set.size());
			set.stream().forEach(e ->map.put(e,e));
			return map;
		};
	}

	@Override
	public Set<Characteristics> characteristics() {
		System.out.println("characteristics invoked");
		return Collections.unmodifiableSet(EnumSet.of(Characteristics.UNORDERED));
	}

	public static void main(String[] args) {
		System.out.println(Runtime.getRuntime().availableProcessors());
		List<String> list = Arrays.asList("hello","world","welcome","hello","a","b","c","d","e","f","g");
		Set<String> set = new HashSet<>();
		set.addAll(list);
		System.out.println("set: " + set);
		//最多生成与cpu核心数相同的线程, 利用硬件英特尔的超线程技术, 将一个cpu核心模拟成两个核心,
		Map<String,String> map = set.parallelStream().collect(new MySetCollector2<>());
//		Map<String,String> map = set.stream().parallel().collect(new MySetCollector2<>());
//		Map<String,String> map = set.stream().sequential().collect(new MySetCollector2<>());
		//多个调用只有最后一个有效
		//Map<String,String> map = set.stream().parallel().sequential().parallel().collect(new MySetCollector2<>());

		System.out.println(map	);
	}
}
