package com.testng;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class NewTest {
  @Test(priority = 3)
  public void Login() {
	  System.out.println("I am in login test case");
  }
  
  @Test(priority = 1)
  public void Reg() {
	  System.out.println("I am in Reg test case");
  }
  
  @Test
  public void Home() {
	  throw new SkipException("We are working on it");
	 // System.out.println("I am in Home test case");
  }
  
  @Test(priority = 4)
  public void Logout() {
	  System.out.println("I am in logout test case");
  }
  
}
