package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SVHER5744\\Desktop\\phase5\\chromedriver_win32//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		System.out.println("Driver loaded successfully");
		driver.get("C:\\Users\\SVHER5744\\Desktop\\phase5\\chromedriver_win32\\index.html");
		String url=driver.getCurrentUrl();
		String title=driver.getTitle();
		System.out.println(url);
		System.out.println(title);
		
		WebElement ele1=driver.findElement(By.tagName("h1"));
		WebElement ele2=driver.findElement(By.id("d1"));
		WebElement ele3=driver.findElement(By.name("button"));
		System.out.println(ele1.getText());
		System.out.println(ele2.getText());
		System.out.println(ele3.getTagName());
		 
		 
	}

}
