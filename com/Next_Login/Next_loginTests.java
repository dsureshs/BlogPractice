package com.Next_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.examples.MyApplicationConstants;



public class Next_loginTests
{

	static WebDriver driver;
	
	public static void main(String[] args)
	{
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.next.co.uk/");
	 	
	 driver.findElement(By.id("onetrust-accept-btn-handler")).click();
	 
	 driver.manage().window().maximize();
	 
	 driver.findElement(By.xpath("//*[@id=\"platform_modernisation_header\"]/header/div[1]/nav/div[2]/div[2]/div[2]/div/a/img")).click();
	 //driver.findElement(By.xpath("//*[@id=\"EmailOrAccountNumber\"]")).sendKeys("deepusureshs@yahoo.co.uk");
	 loginwithRightEmailRightPassword();
	 
	}
	
	public static void loginwithRightEmailRightPassword()
	{
		//driver.findElement(By.xpath("//*[@id=\"EmailOrAccountNumber\"]")).sendKeys(MyApplicationConstants.USERNAME_EMAIL);
		driver.findElement(By.xpath("//*[@id=\"EmailOrAccountNumber\"]")).sendKeys("deepusureshs@yahoo.co.uk");
		//driver.findElement(By.xpath("EmailOrAccountNumber")).sendKeys(MyApplicationConstants.USERNAME_EMAIL);
	}
	//*[@id="EmailOrAccountNumber"]
}
