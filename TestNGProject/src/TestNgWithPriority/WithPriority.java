package TestNgWithPriority;

import org.testng.annotations.Test;

public class WithPriority {
 
  @Test(priority=0)
  public void One() {
	  System.out.println("this is test case One");
  }
  
  @Test(priority=6)
  public void Two() {
	  System.out.println("this is test case Two");
  }
  
  @Test(priority=2)
  public void Three() {
	  System.out.println("this is test case Three");
  }
  
  @Test(priority=3)
  public void four() {
	  System.out.println("this is test case Four");
  }
}
