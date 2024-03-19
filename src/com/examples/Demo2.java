package com.examples;

	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 
{
		
		
	public static void main(String[] args)throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flexiquiz.com/");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
		//driver.findElement(By.id("onetrust-accept-btn-handler")).click( );
		//driver.findElement(By.xpath("////*[@id=\"u_0_k_HU\"]")).click();
		String page_title = driver.getTitle();
		System.out.println(page_title);
		driver.close();
				
	}

}

