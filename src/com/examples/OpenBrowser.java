package com.examples;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class OpenBrowser 
	{

		//public static void  main (String[]args)
		//{
		//WebDriver driver = new ChromeDriver();
		//open browser
		//driver.get("https://naveenprojects.blogspot.com/");
		//return driver;
		//pop-up accept button
		//driver.findElement(By.id("cookieChoiceDismiss")).click();
		//String page_title = driver.getTitle();
		//System.out.println(page_title);
		
		
		public void blogCheck()
		{
			WebDriver driver = new ChromeDriver();
			//open browser
			driver.get("https://naveenprojects.blogspot.com/");
			//return driver;
			//pop-up accept button
			driver.findElement(By.id("cookieChoiceDismiss")).click();
			String page_title = driver.getTitle();
			System.out.println(page_title);
			
		}
		
		

}
