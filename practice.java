package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class practice {
	WebDriver dr = new ChromeDriver();
  @Test
  @Parameters({"username","password"})
  public void f(String username,String password) throws InterruptedException {
	  	  
	  dr.get("https://practice.expandtesting.com/login");
	  JavascriptExecutor js = (JavascriptExecutor)dr;
	  //js.executeScript("window.scrollBy(0,850)");
	 // Thread.sleep(4000);
	  //js.executeScript("window.scrollBy(0,-300)");
	  Thread.sleep(6000);
	  dr.findElement(By.id("username")).sendKeys(username);
	  dr.findElement(By.id("password")).sendKeys(password);
	  //Thread.sleep(4000);
	 // dr.findElement(By.xpath("//button[@type='submit']")).click();
	  Thread.sleep(6000);
	  WebElement w = dr.findElement(By.xpath("//a[@href='https://expandtesting.com/']"));
	  js.executeScript("arguments[0].scrollIntoView(true);",w);
	  
	  dr.findElement(By.xpath("//a[@href='https://expandtesting.com/']")).click();
  }
}
