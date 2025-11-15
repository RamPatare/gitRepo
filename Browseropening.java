package com.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Browseropening {
	 WebDriver dr = new ChromeDriver();
  @Test
  public void f() throws InterruptedException {
	  Thread.sleep(2500);
	  dr.findElement(By.name("username")).sendKeys("Admin");
	  
	  dr.findElement(By.name("password")).sendKeys("admin123");
	  
	  dr.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  Thread.sleep(6000);
	  dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  Thread.sleep(10000);
	 dr.close();
	  
  }

}
