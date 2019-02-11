package com.ziyin.jdk8.joda;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;

import java.util.Date;

/**
 * @author ziyin
 @create 2019-02-2019/2/11-11:37
 */
public class JodaTest3 {

	//服务器存储的时间只是存储时间的绝值,即UTC不带时区, 传到客户端后由客户端决定时区
	public static void main(String[] args) {
		//标砖的UTC时间: 2017-03-01T11:35:17.249+08:00 2017-03-01T11:35:17.249Z

		System.out.println(convertUTCDate("2017-03-01T11:35:17.249Z"));

		System.out.println(convertDate2Utc(new Date()));

		System.out.println(convertDate2LocalByDateFormat(new Date(),"yyyy-MM-dd:HH:mm:ss"));
	}

	public static Date convertUTCDate(String utcDate){
		try {
			DateTime dateTime = DateTime.parse(utcDate, DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ"));
			return dateTime.toDate();
		}catch (Exception ex){
			return null;
		}
	}

	public static String  convertDate2Utc(Date javaDate) {
		DateTime dateTime = new DateTime(javaDate, DateTimeZone.UTC);
		return dateTime.toString();
	}

	public static String convertDate2LocalByDateFormat(Date javaDate,String dateFormat) {
		DateTime dateTime  = new DateTime(javaDate);
		return dateTime.toString(dateFormat);
	}

}
