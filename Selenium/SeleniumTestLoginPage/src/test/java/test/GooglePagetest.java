package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class GooglePagetest {
	WebDriver driver;
	 @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\SVHER5744\\Desktop\\phase5\\chromedriver_win32//chromedriver.exe");
		  driver=new ChromeDriver();
  }
//  @Test
//  public void googlePageTest() {
//	  driver.navigate().to("https://www.google.com");
//	  driver.manage().window().maximize();
	  
//	  WebElement ele1= driver.findElement(By.className("lnXdpd"));	
//	  System.out.println(ele1.getTagName());
//	  
//	  WebElement ele3=driver.findElement(By.name("q"));
//	  ele3.sendKeys("Testing Framework");
//	  
//	  WebElement ele2=driver.findElement(By.name("btnk"));
//	  ele2.click();
//	 
//	  driver.findElement(By.name("q")).getAttribute("lnXdpd");
//	 driver.findElement(By.name("btnk")).click();
//	  
//  }
//  @Test
//  public void loginTest() {
//	  driver.navigate().to("file:///C:/Users/SVHER5744/Desktop/phase5/chromedriver_win32/login.html");
//	  driver.manage().window().maximize();
//	  try {
//		Thread.sleep(5000);
//	} catch (Exception e) {
//		// TODO: handle exception
//	}
//	  driver.findElement(By.name("user")).sendKeys("Siddu");
//	  try {
//			Thread.sleep(5000);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}  
//	  driver.findElement(By.name("pass")).sendKeys("123");	
//	  try {
//			Thread.sleep(5000);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//	  driver.findElement(By.name("b1")).click();
//	  
//  }
  @Test
  public void gmailPageTest() {
	  driver.navigate().to("https://www.gmail.com");
	  driver.manage().window().maximize();
	 
	  try {
			Thread.sleep(500);
		} catch (Exception e) {
			// TODO: handle exception
		}  
	  driver.findElement(By.name("identifier")).sendKeys("siddeswari0104@gmail.com");	
	  try {
			Thread.sleep(500);
		} catch (Exception e) {
			// TODO: handle exception
		}
	  driver.findElement(By.className("VfPpkd-vQzf8d")).click();
	  driver.findElement(By.name("password")).sendKeys("Siddeswarireddy@14");	
	  try {
			Thread.sleep(500);
		} catch (Exception e) {
			// TODO: handle exception
		}
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
