package babuclass.week5.day1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotations {
	@Ignore
	@Test
  public void f() {
	  
	  System.out.println("Printing F");
  }
  
  @Test(enabled=false)
  
  public void z() {
	  System.out.println("Printing z");
  }
  @Test
  public void a() {
	  System.out.println("Printing A");
  }
  @Test(priority=-1)
  public void b() {
	  System.out.println("Printing B");
  }
  
  @Test(priority=1)
  public void c() {
	  System.out.println("Printing C");
  }
  
  @Test(invocationCount=5, invocationTimeOut =5000, threadPoolSize=2 )
  public void d() {
	  System.out.println("Printing D");
  }
  
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
