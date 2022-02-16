package com.sita.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import java.util.List;

import com.sita.pageObjects.HomePage;
import com.sita.pageObjects.Select_amenities;
import com.sita.pages.BaseClass_dev;
import com.sita.pages.LoginPage;
import com.sita.pages.WebdriverUtility;
public class deligation_of_amenities_to_BO extends BaseClass_dev {
	
	public HomePage Hp = new HomePage(driver);

	@Test(priority=1)
	public void login_as_supervisor_and_assigning_fhe()
	{
		
		logger=report.createTest("Login to Sita");
		LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class);
		logger.info("Starting Application");
		loginPage.loginToAPP(excel.getStringData("Login", 0, 0),excel.getStringData("Login", 0, 1));
		logger.pass("Login Success");
		logger = report.createTest("click_on_ArrowButton");
		HomePage Hp = new HomePage(driver);
		WebdriverUtility wb = new WebdriverUtility();
		Hp.Click_ArrowButton_of_supervisor();
		logger.pass("ArrowButton_clicked");
		Hp.Click_ConfirmButton();
		Hp.AssignFile_Handler();
		Hp.RituFHE();
		Hp.AssignButton();
		Hp.sendButton();
		Hp.BackButton();
		//loging out supervisor
		// moving mouse cursor to "logout" dropdown and clicking it.
		WebElement ele = driver.findElement(By.xpath("//img[@class='ant-dropdown-trigger menu-avatar']"));
		wb.mouseOver(driver, ele);
		Hp.Click_on_LogoutButton();
	}
	@Test(priority = 2)
	public void loginFHE_and_assigning_amenities_to_branches()  
	{
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.loginToAPP(excel.getStringData("LoginFHE", 0, 0), excel.getStringData("LoginFHE", 0, 1));
		HomePage Hp = new HomePage(driver);
		WebdriverUtility wb = new WebdriverUtility();
		Hp.Click_ArrowButtonFHE();
		Hp.Click_on_BookingCentre();
		Hp.Click_on_Amenitiestab();
		//selecting all the amenities list
		List<WebElement> allbuttons = driver.findElements(By.xpath("//button[@class='ant-btn btn-select ']"));
		for (WebElement selectbutton : allbuttons) 
		{
			selectbutton.click();
		}
		//deligation of amenities
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Scroll Down
		js.executeScript("window.scrollBy(0,1500)");
		// Scroll Up
		js.executeScript("window.scrollBy(0,-5000)");
		Hp.Click_on_Deligate_Button1();
		//here clicking every blank boxes in selecting amenitie quantities from excel sheet.
		//z_mumbai_units
		Select_amenities Sa = PageFactory.initElements(driver, Select_amenities.class);
		Sa.Z_mumbai_units(excel.getStringData("Amenities",1,1), excel.getStringData("Amenities",2,1),
				excel.getStringData("Amenities",3,1));
		//z_puri_units
		Sa.Z_Puri_units(excel.getStringData("Amenities",6,1), excel.getStringData("Amenities",7,1),
				excel.getStringData("Amenities",8,1));
		
		Hp.confirm_amenities();
		js.executeScript("window.scrollBy(0,1300)");
		Hp.deligate_popup_button();
		Hp.BackButton();
		// moving mouse cursor to "logout" dropdown and clicking it.
		WebElement ele = driver.findElement(By.xpath("//img[@class='ant-dropdown-trigger menu-avatar']"));
		wb.mouseOver(driver, ele);
		Hp.Click_on_LogoutButton();
	}
	@Test(priority = 3)
	public void login_as_Z_Mumbai_andZ_Puri_accepting_all_requested_amenities() throws InterruptedException 
	{
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.loginToAPP(excel.getStringData("LoginBo", 0, 0), excel.getStringData("LoginBo", 0, 1));
		HomePage Hp = new HomePage(driver);
		WebdriverUtility wb = new WebdriverUtility();
		Hp.Arrow_Button_BO();
		Hp.Click_on_Amenitiestab();
		Hp.Lock_Button();
		Thread.sleep(3000);
		Hp.Accept_all_amenities();
		Hp.Accept_popup();
		Hp.BackButton();
		WebElement ele = driver.findElement(By.xpath("//img[@class='ant-dropdown-trigger menu-avatar']"));
		wb.mouseOver(driver, ele);
		Hp.Click_on_LogoutButton();
		loginPage.loginToAPP(excel.getStringData("LoginBo", 1, 0), excel.getStringData("LoginBo", 1, 1));
		Hp.Arrow_Button_BO();
		Hp.Click_on_Amenitiestab();
		Hp.Lock_Button();
		Thread.sleep(3000);
		Hp.Accept_all_amenities();
		Thread.sleep(3000);
		Hp.Accept_popup();
		Thread.sleep(3000);
		Hp.BackButton();
		WebElement ele1 = driver.findElement(By.xpath("//img[@class='ant-dropdown-trigger menu-avatar']"));
		wb.mouseOver(driver, ele1);
		Hp.Click_on_LogoutButton();
		
	}
}

	


	
	
	
	
	
	
	
