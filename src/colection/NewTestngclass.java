package colection;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTestngclass {
  @Test
  public void f() {
	  System.out.println("I am in test ");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("I am in before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("I am in after method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("I am in before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("I am in After class");
  }
  

  @BeforeTest
  public void beforeTest() {
	  System.out.println("I am in before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("I am in after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("I am in before suite");
  }
  
 
  @AfterSuite
  public void afterSuite() {
	  System.out.println("I am in after suite");
  }

}
