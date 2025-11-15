package com.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class FirstTestNGClass {
	 @Test
	  public void F() {
		  System.out.println("I am in test cases ");
	  }
  @Test
  public void Login() {
	  System.out.println("I am in test cases2 ");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("I am in beforeMethod ");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("I am in afterMethod ");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("I am in beforeClass ");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("I am in AfterClass ");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("I am in beforetest ");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("I am in afterTest ");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("I am in beforeSuite ");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("I am in afterSuite ");
  }

}
