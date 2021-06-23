package Demo4;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void Keerti() {
	  String act="Keerti";
	  String exp="Sarode";
	  Assert.assertEquals(act, exp);
  }
  @Test(dependsOnMethods="Keerti",alwaysRun =true)
  public void Rajanish() {
	  System.out.println("This is my 2nd test");
  }
  @Test(dependsOnMethods="Rajanish",alwaysRun = true)
  public void ved() {
	  System.out.println("This is my 3rd test");
  }
  @Test
  public void Vihaan() {
	  System.out.println("This is my 4th test");
  }
}
