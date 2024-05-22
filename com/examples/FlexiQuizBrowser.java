package com.examples;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	
public class FlexiQuizBrowser 
{

	public  WebDriver OpenBrowser()
	{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flexiquiz.com/");
	
	return driver;
	}
}
