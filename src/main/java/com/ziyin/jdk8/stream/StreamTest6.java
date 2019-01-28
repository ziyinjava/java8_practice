package com.ziyin.jdk8.stream;

import java.util.stream.Stream;

/**
 * @author ziyin
 @create 2019-01-2019/1/25-8:10
 */
public class StreamTest6 {
	public static void main(String[] args) {
//		Stream<String> stream = Stream.generate(UUID.randomUUID()::toString);
//		stream.findFirst().ifPresent(System.out::println);

		//对seed无线应用f函数
//		Stream.iterate(1,item -> item + 2).limit(2).forEach(System.out::println);
		Stream<Integer> stream = Stream.iterate(1,item -> item + 2).limit(6);

//		System.out.println(stream.filter(item -> item > 2).mapToInt(item -> item*2).skip(2).limit(2).sum());

		// max和min是返回OptionalInt sum 是返回int, filter,maptoInt方法每次都会返回全新的流,
//		stream.filter(item -> item > 2).mapToInt(item -> item*2).skip(2).limit(2).max().ifPresent(System.out::println);

//		IntSummaryStatistics summaryStatistics = stream.filter(item -> item > 2).mapToInt(item -> item * 2).skip(2)
//				.limit(2).summaryStatistics();
//
//		System.out.println(summaryStatistics.getAverage());
//		System.out.println(summaryStatistics.getMin());
//		System.out.println(summaryStatistics.getCount());
//		System.out.println(summaryStatistics.getMax());

		System.out.println(stream);
		Stream<Integer> stream2 = stream.filter(item -> item > 2);
		System.out.println(stream2);
		Stream<Integer> stream3 = stream2.distinct();
		System.out.println(stream3);




	}
}
