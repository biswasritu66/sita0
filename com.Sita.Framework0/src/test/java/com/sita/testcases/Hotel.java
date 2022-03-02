package com.sita.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

import com.sita.pageObjects.HomePage;
import com.sita.pages.BaseClass_dev;
import com.sita.pages.LoginPage;
import com.sita.pages.WebdriverUtility;

public class Hotel extends BaseClass_dev {
	
	public HomePage Hp = new HomePage(driver);

	/*@Test(priority=1)
	public void supervisor_login_and_assigning_fhe() throws InterruptedException
	{
		
		logger=report.createTest("Login as supervisor");
		LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class);
		logger.info("Starting Application");
		loginPage.loginToAPP(excel.getStringData("Login", 0, 0),excel.getStringData("Login", 0, 1));
		logger.pass("Login Success");
		HomePage Hp = new HomePage(driver);
		WebdriverUtility wb = new WebdriverUtility();
		Hp.Click_ArrowButton_of_supervisor();
		Hp.Click_ConfirmButton();
		Hp.AssignFile_Handler();
		Hp.RituFHE();
		Thread.sleep(2000);
		Hp.AssignButton();
		Hp.sendButton();
		logger=report.createTest("Assign FHE");
		Hp.BackButton();
		//loging out supervisor
		// moving mouse cursor to "logout" dropdown and clicking it.
		WebElement ele = driver.findElement(By.xpath("//img[@class='ant-dropdown-trigger menu-avatar']"));
		wb.mouseOver(driver, ele);
		Hp.Click_on_LogoutButton();
		logger=report.createTest("Logout Successfully By Supervisor");
	}*/
	@Test(priority = 2)
	public void fhe_distribution() throws IOException, InterruptedException  
	{
		logger=report.createTest("Login as FHE");
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.loginToAPP(excel.getStringData("LoginFHE", 0, 0), excel.getStringData("LoginFHE", 0, 1));
		HomePage Hp = new HomePage(driver);
		WebdriverUtility wb = new WebdriverUtility();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Hp.Click_ArrowButtonFHE();
		Hp.Click_on_BookingCentre();
		Hp.Hotel_Select_button();
		Hp.Book_button();
		Hp.Show_more_poc();
		Thread.sleep(2000);
		WebElement Ritu_Poc = driver.findElement(By.xpath("//h3[@class='book-item-sub-header']"));
		js.executeScript("arguments[0].scrollIntoView();", Ritu_Poc);
		Hp.Ritu_poc();
		Hp.File_Upload();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Users\\Ritu\\Documents\\needle_file_upload\\fileupload1.exe");
		//Thread.sleep(2000);
		{
			String FileName = driver.findElement(By.xpath("//span[@title='Screenshot.png']")).getText();
			System.out.println("The Uploaded file name is--"+FileName);
		}
		logger=report.createTest("File Upload successfully for FHE");
		WebElement Confirm_button = driver.findElement(By.xpath("//span[normalize-space()='Confirm']"));
		js.executeScript("arguments[0].scrollIntoView();", Confirm_button);
		Confirm_button.click();
		Thread.sleep(5000);
	}
}

