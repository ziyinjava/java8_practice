package com.ziyin.jdk8.joda;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

/**
 * @author ziyin
 @create 2019-02-2019/2/11-11:27
 */
public class JodaTest2 {
	public static void main(String[] args) {
		DateTime today = new DateTime();
		DateTime tomorrow = today.plusDays(1);
		System.out.println(tomorrow.toString("yyyy-MM-dd"));//tomorrow.toDate()

		DateTime d1 = today.withDayOfMonth(1);
		System.out.println(d1.toString("yyyy-MM-dd"));

		System.out.println("-----------------");

		LocalDate localDate = new LocalDate();
		System.out.println(localDate);

		System.out.println("--------------");

		localDate = localDate.plusMonths(3).dayOfMonth().withMinimumValue();
		System.out.println(localDate);

		//计算两年前第3个月最后一天的日期
		DateTime dateTime = new DateTime();
		DateTime dateTime1 = dateTime.minusYears(2).monthOfYear().setCopy(3).dayOfMonth().withMinimumValue();
		System.out.println(dateTime1);

	}
}
