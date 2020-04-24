package com.weh.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testIsNumber() {
		String str ="14";
		 boolean b = StringUtil.isNumber(str);
		 if(b) {
			 System.out.println("是数字");
		 }else {
			 System.out.println("不是数字");

		 }
			
	}

	@Test
	public void testIsPhone() {
		String str ="15581977429";
		 boolean b = StringUtil.isPhone(str);
		 if(b) {
			 System.out.println("是");
		 }else {
			 System.out.println("不是");

		 }
	}

	@Test
	public void testIsEMail() {
		String str ="123456@qq.com";
		 boolean b = StringUtil.isEMail(str);
		 if(b) {
			 System.out.println("是");
		 }else {
			 System.out.println("不是");

		 }
	}

}
