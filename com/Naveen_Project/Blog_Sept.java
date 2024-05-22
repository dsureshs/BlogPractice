package com.Naveen_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Blog_Sept {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		//Launch Browser
		driver.get("https://naveenprojects.blogspot.com/2023/09/");
		//Maximise window
		driver.manage().window().maximize();
		//Click on Got IT!
		driver.findElement(By.id("cookieChoiceDismiss")).click();
		//Id Element
		driver.findElement(By.id("one")).sendKeys("1234");
		//Name Element
		driver.findElement(By.xpath("//*[@id=\"post-body-8618763667421143981\"]/table/tbody/tr[2]/td/input")).sendKeys("Deepa");
		
	}

}
