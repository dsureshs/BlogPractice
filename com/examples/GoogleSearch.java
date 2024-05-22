package com.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GoogleSearch {

	public static void main(String[] args)throws InterruptedException
	
	{
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		//pop-up --->Accept all 
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div")).click();
		//Entering in the search field
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Automation Job search- Chelmsford");
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys(Keys.ENTER);
		
		
		
	}

}
