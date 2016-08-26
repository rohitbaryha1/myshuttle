package com.microsoft.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.PhantomJS;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class UITest
{
	private String baseUrl = "http://http://52.160.100.113:8080/myshuttledev";
	WebDriver driver;
	
	@Before
	public void setUp()
	{
	  driver = new PhantomJSDriver();
	}
	
	@Test
	public void getHomePage()
	{
	    driver.get(baseUrl + "/");
	    
	    String title = driver.getTitle();
	    assertEquals("The first page should have a title of MyShuttle Login", "MyShuttle Login", title);
	  }

	@After
	public void tearDown() 
	{
	  driver.quit();
	  driver = null;
	}
	
}
	        

