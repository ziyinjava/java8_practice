package com.ziyin.gc;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ziyin
 @create 2019-02-2019/2/13-8:40
 */
public class Demo2 {
	byte[] byteArray = new byte[1024*1024];

	public static void main(String[] args) {
		List<Demo2> list = new ArrayList<>();
		int count = 0;
		try {
			while (true) {
				list.add(new Demo2());
				count = count + 1;
			}
		}catch (Throwable e) {  //这里能用Exception去catch以为oom是属于Error异常
			System.out.println("count " + count);
			e.printStackTrace();
		}
	}
}
