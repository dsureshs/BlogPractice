package com.examples;

import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class AmazonExample {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.co.uk/ref=nav_logo");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("#sp-cc-rejectall-link")).click();
		
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Tabletennis Gewo");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		//driver.findElement(By.id("sp-cc-rejectall-link")).click();
		

	}

}
