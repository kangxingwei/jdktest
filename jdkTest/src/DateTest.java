package com.showme;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DateTest {

	public static void main(String[] args) throws ParseException {
		
		Date date = new Date(1);
		System.out.println(date.toString());
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy",Locale.ENGLISH);
		simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
		System.out.println(simpleDateFormat.format(date));
		Date parse = simpleDateFormat.parse("Thu Jan 01 08:00:00 EST 1970");
		System.out.println(simpleDateFormat.format(date));
		System.out.println(parse.getTime());
		
		System.out.println("------------");
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss zzz");
		simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("GMT"));
		String format2 = simpleDateFormat2.format(new Date(1));
		Date parse2 = simpleDateFormat2.parse("1970-01-01 08:00:00 CST");
		String format3 = simpleDateFormat2.format(new Date(1));
		System.out.println(format2);
		System.out.println(parse2.getTime());
		System.out.println(format3);
		
		
		
	}
}
