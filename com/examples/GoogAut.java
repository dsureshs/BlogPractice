package com.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogAut 
{

	public static void main(String[]args) //throws Interrupted Exception
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div")).click();
		//Thread.sleep(2000);
		
		driver.findElement(By.id("APjFqb")).sendKeys("Selenium Automation Jobs");
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
		//driver.findElement(By.name("btnk")).click();
	}

}
