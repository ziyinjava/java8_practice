package com.ziyin.jdk8.stream2;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/**
 * @author ziyin
 @create 2019-02-2019/2/10-8:19
 */
public class ConsumerTest {
	public void test(Consumer<Integer> consumer) {
		consumer.accept(100);
	}

	public static void main(String[] args) {
		ConsumerTest consumerTest  = new ConsumerTest();
		Consumer<Integer> consumer = i -> System.out.println(i);
		IntConsumer intConsumer = i -> System.out.println(i);
		System.out.println(consumer instanceof Consumer);
		System.out.println(intConsumer instanceof IntConsumer);
		System.out.println(intConsumer instanceof Consumer);
		consumerTest.test(consumer); //面向對象的方式
		consumerTest.test(consumer::accept);//函数式方式
		consumerTest.test(intConsumer::accept);//函数式方式
	}
}
