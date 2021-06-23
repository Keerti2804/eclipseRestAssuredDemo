package Demo1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest1 {
	//executed before all suite
	@BeforeSuite
	  public void beforeSuite() {
		System.out.println("This executes before all ,it is 1st step");
	  }
	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("This executes before all testMethod and after testsuite");
	  }
	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("This is after beforeTest in newtest1.java");
	  }
	  //Before method executes for every @testMethod
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("This executes after beforeClass & before every @test Method");
	  }
	  //test is a method
  @Test
  public void testcase1() {
	  System.out.println("This is testcase1");
  }
  @Test
  public void testcase2() {
	  System.out.println("This is testcase2");
  }
  @AfterMethod
  public void afterMethod() {
	  System.out.println("This will execute after every @testMethod");
  }


 @AfterClass
  public void afterClass() {
	 System.out.println("This will excute after @testMethod in test1.java");
  }

}
