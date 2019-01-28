package com.ziyin.jdk8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @author ziyin
 @create 2019-01-2019/1/27-15:21
 */
public class StreamTest9 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(5000000);
		for (int i = 0; i < 5000000;i++) {
			list.add(UUID.randomUUID().toString());
		}
		System.out.println("开始排序");
		long startTime = System.nanoTime();
	//	list.stream().sorted().count();        //3631
		list.parallelStream().sorted().count();   //1359
		long endTime = System.nanoTime();
		long millis = TimeUnit.NANOSECONDS.toMillis(endTime - startTime);
		System.out.println("排序时间: " + millis);
	}
}
