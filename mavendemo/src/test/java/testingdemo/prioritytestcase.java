package testingdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class prioritytestcase {
  @Test(priority=3)
  public void testcase1() {
	  System.out.println("Test case 1");
  }
  @Test(priority=1,invocationCount=3,invocationTimeOut=5)
  public void testcase2() {
	  System.out.println("Test case 2");
  }
  
  @Test(priority=2,description= "This test case is logout")
  public void testcase3() {
	  System.out.println("Test case 3");
  }
  
  

}
