package com.FlexiQuiz;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.examples.MyApplicationConstants;

import java.time.Duration;

public class LoginTests 
{
	
		static WebDriver driver;
	
		
		public static void validate(String error_message, String message)
		{
			if (error_message.equals(message))
			{
				System.out.println("pass");
			}
			else
			{
				System.out.println("fail");
			}
		}
	
		// Test -1
		public static void loginWithEmptyFields()
		{
			//driver.findElement(By.xpath("//*[@id=\"UserName\"]")).click();
			driver.findElement(By.id("loginNow")).click();
			String error_message = "The Email / Username field is required.";
			String message = driver.findElement(By.id("userNameValidationMessage")).getText();
			validate(error_message,message);
			
		}
	
	// Test -2
		public static void loginWithEmailandWithoutPassword()
		{
			String error_message = "The Password field is required.";
			
			driver.findElement(By.id("UserName")).sendKeys(MyApplicationConstants.USERNAME_EMAIL);
			
			driver.findElement(By.cssSelector("input[id$='loginNow']")).click();
			
			String message = driver.findElement(By.id("passwordValidationMessage")).getText();
			
			validate(error_message,message);
		}
	
		// Test - 3
		public static void loginWithPasswordWithoutEmail()
		{
			String error_message = "The Email / Username field is required.";
			
			driver.findElement(By.id("UserName")).clear();
		
			driver.findElement(By.id("Password")).sendKeys(MyApplicationConstants.USER_PASSWORD);
			
			driver.findElement(By.cssSelector("input[id$='loginNow']")).click();
			
			String message = driver.findElement(By.id("userNameValidationMessage")).getText();
			
			validate(error_message,message);
			
		}
		
		// Test  -4
		
		public static void loginWithWrongEmailPassword()
		{
			String error_message = "The user name or password provided is incorrect.";
			
			driver.findElement(By.id("UserName")).clear();
			driver.findElement(By.id("UserName")).sendKeys("deepusureshs@yaho.co.uk");
			driver.findElement(By.id("Password")).clear();
			driver.findElement(By.id("Password")).sendKeys("niceday01");
			
			driver.findElement(By.cssSelector("input[id$='loginNow']")).click();
			
			String message = driver.findElement(By.xpath("//*[@id=\"loginControls\"]/form/div[1]/ul/li")).getText();
			
			validate(error_message,message);
		}
		
		// Test - 5 loginWithRightEmailWrongPassword()
		
				public static void loginWithRightEmailWrongPassword()
				{
					String error_message = "The user name or password provided is incorrect.";
					
					driver.findElement(By.id("UserName")).clear();
					driver.findElement(By.id("UserName")).sendKeys(MyApplicationConstants.USERNAME_EMAIL);
					driver.findElement(By.id("Password")).clear();
					driver.findElement(By.id("Password")).sendKeys("niceday01");
					
					driver.findElement(By.cssSelector("input[id$='loginNow']")).click();
					
					String message = driver.findElement(By.xpath("//*[@id=\"loginControls\"]/form/div[1]/ul/li")).getText();
					
					validate(error_message,message);
					
				}
			//// Test - 6
				// Login with wrong email and right password
				public static void loginWithWrongEmailRightPassword()
				{
					String error_message = "The user name or password provided is incorrect.";
					
					driver.findElement(By.id("UserName")).clear();
					driver.findElement(By.id("UserName")).sendKeys("deepsureshs@yahoo.co.uk");
					driver.findElement(By.id("Password")).clear();
					driver.findElement(By.id("Password")).sendKeys(MyApplicationConstants.USER_PASSWORD);
					
					driver.findElement(By.cssSelector("input[id$='loginNow']")).click();
					
					String message = driver.findElement(By.xpath("//*[@id=\"loginControls\"]/form/div[1]/ul/li")).getText();
					
					validate(error_message,message);
				}
				
				// Test - 7
				public static void loginWithValidUsernamePassword()
				{
					driver.findElement(By.id("UserName")).clear();
					driver.findElement(By.id("UserName")).sendKeys(MyApplicationConstants.USERNAME_EMAIL);
					
					driver.findElement(By.id("Password")).clear();
					driver.findElement(By.id("Password")).sendKeys(MyApplicationConstants.USER_PASSWORD);
					
					driver.findElement(By.cssSelector("input[id$='loginNow']")).click();
					
					try
					{
						driver.findElement(By.id("userLogOut"));
						System.out.println("Valid user");
					}
					catch (Exception e)
					{
						System.out.println("Invalid user");
					}
				}
				
		
		
	public static void main(String[] args) 
	{
	
		driver = new OpenBrowser().launchBrowser();
		
		//driver.findElement(By.xpath("/html/body")).click();
		 //driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
		//driver.findElement(By.cssSelector("a.btn.btn-sm.btn-link")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("onetrust-accept-btn-handler")).sendKeys(Keys.ENTER);
		//*[@id="onetrust-accept-btn-handler"]
		//Mazimize current window
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("fq-home-full")).sendKeys(Keys.ENTER);
		//clicking login icon & navigates to a new page
		driver.findElement(By.id("fq-main-menu-auth")).sendKeys(Keys.ENTER);

		
		//Test 1
		loginWithEmptyFields();
		
		//Test 2
		loginWithEmailandWithoutPassword();
		
		//Test 3
		loginWithPasswordWithoutEmail();
		
		//Test - 4
		loginWithWrongEmailPassword();
		
		// Test - 5
		loginWithRightEmailWrongPassword();
			
		// Test - 6
				// Login with wrong email and right password
		loginWithWrongEmailRightPassword();
		
		// Test - 7
		// Login with valid username and password 
		loginWithValidUsernamePassword();
		
	}

}
