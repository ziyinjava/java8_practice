package com.ziyin.gc;

/**
 * @author ziyin
 @create 2019-02-2019/2/13-8:11
 */
public class Demo1 {
	/*
		本机23.9G
		MAX_MEMORY = 5708447744（字节）、5444.0MB  -Xmx  最大分配内存 默认物理内存的1/4
		TOTAL_MEMORY = 385875968（字节）、368.0MB  -Xms 初始分配大小  物理内存的1/64
	 */
	public static void main(String[] args){
		long maxMemory = Runtime.getRuntime().maxMemory() ;//返回 Java 虚拟机试图使用的最大内存量。
		long totalMemory = Runtime.getRuntime().totalMemory() ;//返回 Java 虚拟机中的内存总量。
		System.out.println("MAX_MEMORY = " + maxMemory + "（字节）、" + (maxMemory / (double)1024 / 1024) + "MB");
		System.out.println("TOTAL_MEMORY = " + totalMemory + "（字节）、" + (totalMemory / (double)1024 / 1024) + "MB");
	}

}
