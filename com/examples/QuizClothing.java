package com.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuizClothing {

	public static void main(String[] args)throws InterruptedException
	
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.quizclothing.co.uk/en-GB");

		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[8]/div[2]/div/div/div[2]/button")).click();
		
		
		//driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div[2]/div/div/div/div[2]/div[2]/div/div/div[1]/div/div[1]/div/div[1]/a/span/p")).getText()

		
		//driver.findElement(By.xpath("//*[@id=\"myAccount\"]/div/span/svg")).click();
		//driver.findElement(By.xpath("//*[@id=\"myAccount\"]/div/p")).click();
	}

}
