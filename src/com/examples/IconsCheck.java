package com.examples;


	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	//Google search example
	public class IconsCheck 
	{
		
	public static void main(String[] args) 
	{

		
		WebDriver driver = new ChromeDriver();
		//open browser
		driver.get("https://www.google.com/");
		//pop-up accept all button
		driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div")).click();
		String location = driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[1]")).getText();
		System.out.println("current Location is : " + location);
		
		
		//driver.findElement(By.xpath("/html/body")).click();
		// find search bar and enter search text
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Selenium Dev java");
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
		//driver.findElement(By.name("btnK")).click();
		//driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]")).click();
		
		//String location = driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[1]")).getText();
		//System.out.println("Current Location : " + location);
		
	//	driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
		
	}
	}
