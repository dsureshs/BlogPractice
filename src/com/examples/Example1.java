package com.examples;

	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.safari.SafariDriver;
	import org.openqa.selenium.WebDriver;

public class Example1 {

	public static void main(String[] args) 
	{
		String url = "https://www.google.com/";
		
		WebDriver  driver = new ChromeDriver();
		driver.get(url);
		
		WebDriver driver1 = new FirefoxDriver();
		driver1.get(url);
		
		WebDriver driver2 = new EdgeDriver();
		driver2.get(url);
		
		//WebDriver driver3 = new SafariDriver();
		//driver3.get(url);

	}

}
