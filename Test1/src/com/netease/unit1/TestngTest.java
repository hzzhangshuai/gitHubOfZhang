package com.netease.unit1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngTest {

	@BeforeTest
	public void init() {

	}

	@Test
	public void test() {
		System.out.println("testng has been installed!");
	}

	@AfterTest
	public void clean() {

	}

}
