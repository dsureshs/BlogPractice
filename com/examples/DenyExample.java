package com.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DenyExample
{
public static void main(String[] args)throws InterruptedException
	
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.marksandspencer.com/");
		driver.manage().window().maximize();

		Thread.sleep(5000);
		
		
		driver.findElement(By.id("onetrust-reject-all-handler")).click();
		
		driver.findElement(By.cssSelector("#searchId")).sendKeys("v neck womens T-shirts");
		driver.findElement(By.cssSelector("#searchId")).sendKeys(Keys.ENTER);
		

		
		//driver.findElement(By.xpath("//*[@id=\"myAccount\"]/div/span/svg")).click();
		//driver.findElement(By.xpath("//*[@id=\"myAccount\"]/div/p")).click();
	}
}
