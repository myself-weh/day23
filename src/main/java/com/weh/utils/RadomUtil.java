package com.weh.utils;

import java.util.HashSet;
import java.util.Random;

public class RadomUtil {

	//min-max之间的随机数
	public static int radom(int min,int max) {
		if (min>=max) {
			throw new RuntimeException("请输入正确值");
		}
		Random random = new Random();
		int i = random.nextInt(max-min+1)+min;
		return i;
	}
	//返回某个区间的随机整数数组
	public static int[] subRandom(int min,int max,int subs) {
		int[] result = new int[subs];
		HashSet<Integer> set = new HashSet<Integer>();
		while (set.size()!=subs) {
			set.add(radom(min, max));
		}
		int i = 0;
		for (Integer val : set) {
			result[i] = val;
			i++;
		}
		return result;
	}
	
	//返回一个随机字符
	public static char randomCharacter() {
		String str = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		return str.charAt(radom(0, str.length()-1));
	}
	
	//返回指定长度的字符
	public static String stringRandom(int length) {
		StringBuffer str = new StringBuffer();
		for (int i = 0; i < length; i++) {
			str.append(randomCharacter());
		}
		return str.toString();
	}
}
