package Demo1;

import org.testng.annotations.Test;

public class demo3 {
  @Test(priority=1)
  public void Ved() {
	  System.out.println("This is testcase1");
  }
  @Test(priority=3)
  public void Keerti() {
	  System.out.println("This is testcase2");
  }
  @Test(priority=0)
  public void Vihaan() {
	  System.out.println("This is testcase3");
  }
  @Test(priority=2)
  public void Rajanish() {
	  System.out.println("This is testcase4");
  }
  //no priority mentioned,so it will be taken as 0
  @Test
  public void test1() {
	  System.out.println("This is testcase5");
  }
  @Test
  public void test2() {
	  System.out.println("This is testcase6");
  }
}
