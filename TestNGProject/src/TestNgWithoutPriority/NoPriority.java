package TestNgWithoutPriority;

import org.testng.annotations.Test;

public class NoPriority {
  
//execute in alphabetical order in which it give priority to capitalized methods/*One*/
  @Test
  public void One() {
	  System.out.println("this is test case One");
  }
  
  @Test
  public void two() {
	  System.out.println("this is test case Two");
  }
  
  @Test
  public void Three() {
	  System.out.println("this is test case Three");
  }
  
  @Test
  public void four() {
	  System.out.println("this is test case Four");
  }
  
}
