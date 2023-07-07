package SeleniumHomework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
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
	  Assert.assertTrue(false);
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
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
