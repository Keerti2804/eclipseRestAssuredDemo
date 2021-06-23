package Demo1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest2 {
	@BeforeClass
	public void bc() {
		System.out.println("this is before class of Test2");
	}
  @Test
  public void testcase3() {
	  System.out.println("this is testcase3");
  }
  @AfterClass
  public void ac() {
	  System.out.println("This is after class of test2");
  }
  @AfterTest
  public void afterTest() {
 	  System.out.println("This will execute before @aftertestSuite");
  }

   
   @AfterSuite
   public void afterSuite() {
	   System.out.println("This is at the end");
   }

}
