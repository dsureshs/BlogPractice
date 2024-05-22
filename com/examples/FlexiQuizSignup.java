package com.examples;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	


public class FlexiQuizSignup extends FlexiQuizBrowser

{
		 WebDriver driver;
		
		 public void Example()
		{
	//		 FlexiQuizBrowser.OpenBrowser();
			WebDriver driver = OpenBrowser();
			
			
		}
		 public void signUp() throws InterruptedException
			{
				WebDriver driver = OpenBrowser();
				driver.findElement(By.id("fq-main-menu-access")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
			}
			
			public void loginCheck()
			{
				WebDriver driver = OpenBrowser();
				driver.findElement(By.id("fq-main-menu-auth")).click();
				
			}
			
			public void products()
			{
				WebDriver driver = OpenBrowser();
				driver.findElement(By.xpath("//*[@id=\"fq-main-menu-item-product\"]/a"));
			}
			
			public void pricing()
			{
				WebDriver driver = OpenBrowser();
				driver.findElement(By.xpath("//*[@id=\"fqo-main-menu-item-pricing\"]/a"));
			}
			
		
		
	
		}


