package testingdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Sampletestcase {
  @Test
  public void testcase1() {
	  System.out.println("Test Case 1");
  }
  @Test
  public void testcase2() {
	  System.out.println("Test Case 2");
  }
  
  @Test
  public void testcase3() {
	  System.out.println("Test Case 3");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method:Launch the app");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method:Close the app");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class:Prepare test data");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class:Clear test data");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test:Open db connection");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test:CLose db connection");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suite:Smoke testing");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suite:Generate report");
  }

}
