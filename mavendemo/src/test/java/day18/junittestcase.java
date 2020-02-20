package day18;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class junittestcase {
	
	@Test
	public void testcase1() {
		
		System.out.println("Testcase1");
		
	}
	@Test
	public void testcase2() {
		
		System.out.println("Testcase1");
		
	}

	@Test
	public void testcase3() {
		
		System.out.println("Testcase1");
		
	}
@Before
public void bmethod() {
	
	System.out.println("before method");
	
}
@After
public void amethod() {
	
	System.out.println("after method");
	
}
@BeforeClass
public static void bclass() {
	
	System.out.println("before class");
	
}
@AfterClass
public static void aclass() {
	
	System.out.println("after class");
	
}


}
