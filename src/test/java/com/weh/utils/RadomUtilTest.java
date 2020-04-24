package com.weh.utils;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Random;

import org.junit.Test;

public class RadomUtilTest {

	@Test
	public void testRadom() {
		for (int i = 0; i < 10; i++) {
			System.out.println(RadomUtil.radom(2, 10));
		}
	}
	
	@Test
	public void testsubRandom() {
		
		System.out.println(Arrays.toString(RadomUtil.subRandom(2, 10, 3)));
	}
	
	@Test
	public void testrandomCharacter() {
		
		System.out.println(RadomUtil.randomCharacter());
	}
	
	@Test
	public void teststringRandom() {
		
		System.out.println(RadomUtil.stringRandom(5));
	}

}
