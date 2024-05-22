package com.Naveen_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Blog_Project 

{
	static WebDriver driver;
	
	//public static void nameTab()
	{
		//finding name element
				//driver.findElement(By.xpath("//*[@id=\"post-body-8066730700853217911\"]/table/tbody/tr[1]/td[2]/input")).click();
				//driver.findElement(By.xpath("//*[@id=\"post-body-8066730700853217911\"]/table/tbody/tr[1]/td[2]/input")).clear();
				//driver.findElement(By.xpath("//*[@id=\"post-body-8066730700853217911\"]/table/tbody/tr[1]/td[2]/input")).sendKeys("Deepa");
	//	driver.findElement(By.className("form-control")).clear();
		//driver.findElement(By.className("form-control")).sendKeys("Deepa");
		//*[@id="post-body-8066730700853217911"]/table/tbody/tr[1]/td[2]/input
	
	}
	

	public static void main(String[] args) throws Exception
	
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenprojects.blogspot.com/2023/08/");
		
		//maximise window size
		driver.manage().window().maximize();
		//accept cookies
		driver.findElement(By.id("cookieChoiceDismiss")).click();
		
		//finding name element
		driver.findElement(By.xpath("//*[@id=\"post-body-8066730700853217911\"]/table/tbody/tr[1]/td[2]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"post-body-8066730700853217911\"]/table/tbody/tr[1]/td[2]/input")).clear();
		driver.findElement(By.xpath("//*[@id=\"post-body-8066730700853217911\"]/table/tbody/tr[1]/td[2]/input")).sendKeys("Deepa");
//	driver.findElement(By.className("form-control")).clear();
//driver.findElement(By.className("form-control")).sendKeys("Deepa");
//*[@id="post-body-8066730700853217911"]/table/tbody/tr[1]/td[2]/input
		//finding Text Area Tab
		driver.findElement(By.id("floatingTextarea")).sendKeys("Learning Automation");
		//Clicking Button
		driver.findElement(By.id("b1")).sendKeys(Keys.ENTER);
		
		//Thread.sleep(5000);
		
		//Finding Name image
		//driver.findElement(By.xpath("//*[@id=\"timeLeft\"]")).sendKeys("Image shown");
		//driver.findElement(By.id("timeLeft")).sendKeys("Image Shown");
		driver.findElement(By.id("timeLeft")).click();
		//Thread.sleep(2000);
		//Unable to write anything in Name field(next to the image)
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}

}
