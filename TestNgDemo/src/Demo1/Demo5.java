package Demo1;

import org.testng.annotations.Test;

public class Demo5 {
	@Test(groups= {"smoke"})
	public void testcase1() {
		System.out.println("This is smoke test");
	}
	@Test(groups= {"smoke"})
	public void testcase2() {
		System.out.println("This is smoke test");
	}
	@Test(groups= {"regression"})
	public void testcase3() {
		System.out.println("This is regression test");
	}
	@Test(groups= {"regression"})
	public void testcase4() {
		System.out.println("This is regression test");
	}
	@Test(groups= {"smoke"})
	public void testcase5() {
		System.out.println("This is smoke test");
	}
	@Test(groups= {"regression"})
	public void testcase6() {
		System.out.println("This is regression test");
	}
}
