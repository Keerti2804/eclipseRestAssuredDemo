package Demo;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNg {
	@BeforeTest
	public void beforetest() {
		System.out.println("Before test");
		Assert.assertEquals("Keerti", "sarode");
	}
	@Test
	public void testcase1() {
		System.out.println("This is @test");
	}
   @AfterTest
   public void aftertest() {
	   System.out.println("After test");
	   
   }
}
