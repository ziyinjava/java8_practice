package com.ziyin.jdk8.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author ziyin
 @create 2019-01-2019/1/23-19:59
 */
public class StreamTest4 {
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("hello","world","helloworld");
	//	String[] stringArray = stream.toArray(length -> new String[length]);
//		String[] stringArray = stream.toArray(String[]::new);
//		Arrays.asList(stringArray).forEach(System.out::println);

		//List<String> list = stream.collect(Collectors.toList());
//		List<String> list = stream.collect(() -> new ArrayList(),(theList,item) -> theList.add(item),(theList1,theList2) -> theList1.add(theList2));
		//每次add都会有新的list产生, 最终会将中间的list合并起来放到结果list中
//			List<String> list = stream.collect(LinkedList::new,LinkedList::add,LinkedList::addAll);

	//	List<String> list = stream.collect(Collectors.toCollection(ArrayList::new));//指定类型
//		Set<String> set = stream.collect(Collectors.toCollection(TreeSet::new));
//		System.out.println(set.getClass());

		String str = stream.collect(Collectors.joining());
		System.out.println(str);


	}
}
