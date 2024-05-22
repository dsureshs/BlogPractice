package com.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check1 extends OpenBrowser
{
	public void idElement()
	{
		WebDriver driver = new ChromeDriver();
		blogCheck();
		driver.findElement(By.id("one")).sendKeys("1234");
		//driver.findElement(By.xpath("/html/body")).sendKeys(1234);
	}
	
	
	
}
