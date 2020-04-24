package com.weh.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	@Test
	public void testGetAgeByBirthday() {
		Calendar c = Calendar.getInstance();
		c.set(1996, 6, 25);
		
		int age = DateUtil.getAgeByBirthday(c.getTime());
		
		System.out.println(age);
	}

	@Test
	public void testGetInitMonth() {
		Calendar c = Calendar.getInstance();
		c.set(2020, 7, 23);
		
		Date date = DateUtil.getEndMonth(c.getTime());
		Date initMonth = DateUtil.getInitMonth(new Date());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String format = sdf.format(date);
		System.out.println(format);
	}

	@Test
	public void testGetEndMonth() {
		Calendar c = Calendar.getInstance();
		c.set(2020, 4, 23);
		
		Date date = DateUtil.getEndMonth(c.getTime());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String format = sdf.format(date);
		System.out.println(format);
	}

	@Test
	public void testRandom() {
		Calendar c = Calendar.getInstance();
		c.set(1994, 9, 1);

		Date date = DateUtil.random(c.getTime(), new Date());
		SimpleDateFormat fm = new SimpleDateFormat("yyyy-MM-dd ");
		String format = fm.format(date);
		System.out.println(format);
	}

}
