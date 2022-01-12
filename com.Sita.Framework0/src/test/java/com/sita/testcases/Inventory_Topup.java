package com.sita.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Inventory_Topup {
	WebDriver driver=null;
	@BeforeTest
	public void Login() throws InterruptedException {
		//CreateUser Cu= new CreateUser(driver);
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://d303pqppq4034l.cloudfront.net/login");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("inventoryadmin@sita.in");
		driver.findElement(By.id("password")).sendKeys("Test@123");
		driver.findElement(By.xpath("//span[normalize-space()='Login']")).click();
		
	}
}
