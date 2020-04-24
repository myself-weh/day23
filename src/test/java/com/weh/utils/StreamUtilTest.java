package com.weh.utils;

import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import org.junit.Test;

public class StreamUtilTest {

	@Test
	public void testCloseAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testReadTextFileInputStream() {
		String path ="C:\\Users\\Mr.Wu\\Desktop\\config\\222.txt";
		
		String string = "";
		try {
			string = StreamUtil.readTextFile(new FileInputStream(path));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(string);
	}

	@Test
	public void testReadTextFileFile() {
		String path ="C:\\Users\\Mr.Wu\\Desktop\\config\\222.txt";
		String file = StreamUtil.readTextFile(new File(path));
		System.out.println(file);
	}

	@Test
	public void testReadTextFile2List() {
		String path ="C:\\Users\\Mr.Wu\\Desktop\\config\\222.txt";
		List<String> list = StreamUtil.readTextFile2List(new File(path));
		for (String string : list) {
			System.out.println(string);
		}
	
	}

}
