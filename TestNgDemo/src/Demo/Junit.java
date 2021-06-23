package Demo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class Junit {
	//which will run before the test
	
	@Before
	public void beforetest() {
		System.out.println("This is before the test ie.setupscript");
		String act="Keerti";
		String exp="Sarode";
		Assert.assertEquals(exp, act);
	}
	@Test
	public void testcase1() {
		System.out.println("This is Junit");
	}
	//which will run after the test
	@After
	public void aftertest() {
		System.out.println("This is after the test ie.teardownscript");
	}
	

}
