package com.testng;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class propdemo {
  @Test
  public void f() throws Exception {
	  WebDriver dr = new ChromeDriver();
	  dr.manage().window().maximize();
	  Properties p = new Properties();
	  FileReader fr = new FileReader("C:\\Users\\CDAC\\Desktop\\testNG\\TestNGproject\\src\\input.properties");
	  p.load(fr);
	  dr.get(p.getProperty("url"));
	  dr.findElement(By.name("username")).sendKeys(p.getProperty("username"));
	  dr.findElement(By.name("password")).sendKeys(p.getProperty("password"));
  }
}
