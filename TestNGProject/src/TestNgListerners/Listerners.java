package TestNgListerners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class Listerners {
  @Test
  public void f() {
  }
  
  public WebDriver driver;
  
  public void onTestStart(ITestResult result) {
	  System.out.println("The name of the testcase started is :" + result.getName());
  }
  
  public void onTestSuccess(ITestResult result) {
	  System.out.println("The name of the testcase started is :" + result.getName());
  }
  
  public void onTestFailure(ITestResult result) {
	  System.out.println("The name of the testcase started is :" + result.getName());
  }
  
  public void onTestSkipped(ITestResult result) {
	  System.out.println("The name of the testcase started is :" + result.getName());
  }
  
  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	  System.out.println("The name of the testcase started is :" + result.getName());
  }
  
  public void onStart(ITestContext context) {
	  System.setProperty("webdriver.chrome.driver","C:\\drivers\\SeleniumDrivers\\74\\chromedriver.exe");
	  driver = new ChromeDriver();
	 // System.out.println("The name of the testcase started is :" + result.getName());
  }
  
  public void onFinisha(ITestContext context) {
	  driver.quit();
  }
}
