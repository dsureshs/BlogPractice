package com.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Email_signup 

{

	public static void main(String[] args) throws InterruptedException
	
	{
		  WebDriver driver = new ChromeDriver();
	        
	        driver.get("https://www.flexiquiz.com/");
	        
	    
	        //driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
	        Thread.sleep(5000);
	        
	        driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
	        
	        driver.findElement(By.id("fq-main-menu-access")).click();
	        
	        driver.findElement(By.id("signupEmail")).sendKeys("deepusureshs@yahoo.co.uk");
	        
	        driver.findElement(By.id("signupPassword")).sendKeys("Niceday01");
	        
	        driver.findElement(By.id("signupNow")).click();	
		


	}

}
