package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class SimpleTest {
	WebDriver driver;
	 @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\SVHER5744\\Desktop\\phase5\\chromedriver_win32//chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("C:\\Users\\SVHER5744\\Desktop\\phase5\\chromedriver_win32\\index.html");
	  }
  @Test
  public void testTitle() {
	  String title=driver.getTitle();
	  assertEquals("My App", title);
  }
  @Test
  public void testHeading() {
	 WebElement ele1=driver.findElement(By.tagName("h1"));
	  assertEquals(ele1.getText(),"Welcome to Simple Selenium Testing ");
	  
  }
  public void testpTag() {
	  String p=driver.getTitle();
	  assertEquals("Siddishwari ", p);
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
