package com.FlexiQuiz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OpenBrowser 

{
		public WebDriver launchBrowser()
		{
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.flexiquiz.com/");
			
			return driver;
		}
}
