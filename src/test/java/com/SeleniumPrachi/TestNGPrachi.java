package com.SeleniumPrachi;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGPrachi {
	@Test
	public void testCase1() {
		System.out.println("Inside Testcase1");
	}

	@Test
	public void testCase2() {
		System.out.println("Inside Testcase2");
	}

	@Test
	public void testCase3() {
		System.out.println("Inside Testcase3");
		// Assert.assertTrue(false);
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Inside before method");
	}

	@AfterMethod
	public void afterMethod() {
	}

	@BeforeClass
	public void beforeClass() {
	}

	@AfterClass
	public void afterClass() {
	}

	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
	}

	@BeforeSuite
	public void beforeSuite() throws IOException {
		System.out.println("Inside before suite");
		System.out.println(System.getProperty("user.dir"));
		try {
			File objFile = new File(System.getProperty("user.dir") + "/src/test/resources/Configure.Property");
			FileInputStream objFileInput = new FileInputStream(objFile);
			Properties objProp = new Properties();
			objProp.load(objFileInput);
			String amazon = objProp.getProperty("amazon");
			String browser = objProp.getProperty("browser");
			System.out.println("amazon=" + amazon);
			System.out.println("browser=" + browser);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@AfterSuite
	public void afterSuite() {
	}

}
