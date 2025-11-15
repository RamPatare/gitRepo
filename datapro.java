package com.testng;

import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class datapro {
	
	
  @Test(dataProvider = "dp")
  public void f(String n, String s) throws InterruptedException {
	  WebDriver dr = new ChromeDriver();
	  dr.manage().window().maximize();
	  dr.get("https://practicetestautomation.com/practice-test-login/");
	  dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  List<WebElement> el = dr.findElements(By.tagName("a"));
	  System.out.println("The number of text box are "+el.size());
	  for(WebElement s3 : el) {
	  System.out.println("The number of text box are "+s3.getText());
	  }
	  dr.findElement(By.name("username")).sendKeys(n);
	  dr.findElement(By.name("password")).sendKeys(s);
	  //Thread.sleep(2000);
	  dr.findElement(By.id("submit")).click();
	  //Thread.sleep(4000);
	  dr.findElement(By.xpath("//a[@class='wp-block-button__link has-text-color has-background has-very-dark-gray-background-color']")).click();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Ram", "ram123" },
      new Object[] { "student", "Password123" },
    };
  }
}
