package Demo1;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class data {
  @Test(dataProvider = "dp")
  public void f(String n, String s) {
	  System.out.println(n);
	  System.out.println(s);
  }
  //when you want to run code with multiple set of data
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Keerti", "sarode" },
      new Object[] { "Rajanish", "lal" },
      new Object[] { "Ved", "Keeraj" },
    };
  }
}
