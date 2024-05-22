package com.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayExample {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ebay.co.uk/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("gdpr-banner-decline")).click();
		driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("ammibo botw");
		driver.findElement(By.id("gh-btn")).click();

	}

}
