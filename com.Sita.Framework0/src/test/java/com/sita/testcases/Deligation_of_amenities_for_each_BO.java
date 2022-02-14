
package com.sita.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.sita.pageObjects.HomePage;
import com.sita.pageObjects.Select_amenities;
import com.sita.pages.BaseClass_dev;
import com.sita.pages.LoginPage;
import com.sita.pages.WebdriverUtility;

public class Deligation_of_amenities_for_each_BO extends BaseClass_dev {
	
	public HomePage Hp;
	
	
	@Test(priority = 1)
	public void loginApp() 
	{
		logger = report.createTest("Login to Sita");
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		logger.info("Starting Application");
		loginPage.loginToAPP(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));
		logger.pass("Login Success");
	}

	@Test(priority = 2)
	public void supervisor_login_and_assigning_fhe() 
	{
		logger = report.createTest("click_on_ArrowButton");
		HomePage Hp = new HomePage(driver);
		WebdriverUtility wb = new WebdriverUtility();
		Hp.Click_ArrowButton_of_supervisor();
		logger.pass("ArrowButton_clicked");
		Hp.Click_ConfirmButton();
		Hp.AssignFile_Handler();
		Hp.NaveenFHE();
		Hp.AssignButton();
		Hp.sendButton();
		Hp.BackButton();
		//loging out supervisor
		// moving mouse cursor to "logout" dropdown and clicking it.
		WebElement ele = driver.findElement(By.xpath("//img[@class='ant-dropdown-trigger menu-avatar']"));
		wb.mouseOver(driver, ele);
		Hp.Click_on_LogoutButton();
	}
	
	@Test(priority = 3)
	public void loginFHE_and_assigning_amenities_list_to_branches() 
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
		js.executeScript("window.scrollBy(0,-3000)");
		Hp.Click_on_Deligate_Button1();
		//here clicking every blank boxes in selecting amenitie quantities from excel sheet.
		Select_amenities Sa = PageFactory.initElements(driver, Select_amenities.class);
		Sa.Z_mumbai_units(excel.getStringData("Amenities",1,1), excel.getStringData("Amenities",2,1),
				excel.getStringData("Amenities",3,1));
		Sa.Z_Puri_units(excel.getStringData("Amenities", 6, 1), excel.getStringData("Amenities",7,1),
				excel.getStringData("Amenities", 8,1), excel.getStringData("Amenities", 9, 1));
		Sa.Z_Bhubneswar_units(excel.getStringData("Amenities",11,1),excel.getStringData("Amenities",12,1),
				excel.getStringData("Amenities",13,1),excel.getStringData("Amenities",14,1));
		Hp.confirm_amenities();
		js.executeScript("window.scrollBy(0,2000)");
		Hp.deligate_popup_button();
		Hp.BackButton();
		// moving mouse cursor to "logout" dropdown and clicking it.
		WebElement ele = driver.findElement(By.xpath("//img[@class='ant-dropdown-trigger menu-avatar']"));
		wb.mouseOver(driver, ele);
		Hp.Click_on_LogoutButton();
	}
	
	@Test(priority = 4)
	public void login_as_Z_Mumbai_accepting_all_requested_amenities() 
	{
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.loginToAPP(excel.getStringData("LoginBo", 0, 0), excel.getStringData("LoginBo", 0, 1));
		HomePage Hp = new HomePage(driver);
		WebdriverUtility wb = new WebdriverUtility();
		Hp.Arrow_Button_BO();
		Hp.Click_on_Amenitiestab();
		Hp.Lock_Button();
		wu.waitUntilPageLoad(driver);
		Hp.Accept_all_amenities();
		wu.waitUntilPageLoad(driver);
		Hp.Accept_popup();
		Hp.BackButton();
		WebElement ele = driver.findElement(By.xpath("//img[@class='ant-dropdown-trigger menu-avatar']"));
		wb.mouseOver(driver, ele);
		Hp.Click_on_LogoutButton();
		
	}

	@Test(priority = 5)
	public void login_as_Z_bhubneswar_accepting_all_requested_amenities() 
	{
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.loginToAPP(excel.getStringData("LoginBo", 1, 0), excel.getStringData("LoginBo", 1, 1));
		HomePage Hp = new HomePage(driver);
		WebdriverUtility wb = new WebdriverUtility();
		Hp.Arrow_Button_BO();
		Hp.Click_on_Amenitiestab();
		Hp.Lock_Button();
		wu.waitUntilPageLoad(driver);
		Hp.Accept_all_amenities();
		wu.waitUntilPageLoad(driver);
		Hp.Accept_popup();
		Hp.BackButton();
		WebElement ele = driver.findElement(By.xpath("//img[@class='ant-dropdown-trigger menu-avatar']"));
		wb.mouseOver(driver, ele);
		Hp.Click_on_LogoutButton();
	}

	@Test(priority = 6)
	public void login_as_Z_Puri() 
	{
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.loginToAPP(excel.getStringData("LoginBo", 2, 0), excel.getStringData("LoginBo", 2, 1));
		HomePage Hp = new HomePage(driver);
		WebdriverUtility wb = new WebdriverUtility();
		Hp.Arrow_Button_BO();
		Hp.Click_on_Amenitiestab();
		Hp.Lock_Button();
		wu.waitUntilPageLoad(driver);
		Hp.Accept_all_amenities();
		wu.waitUntilPageLoad(driver);
		Hp.Accept_popup();
		Hp.BackButton();
		WebElement ele = driver.findElement(By.xpath("//img[@class='ant-dropdown-trigger menu-avatar']"));
		wb.mouseOver(driver, ele);
		Hp.Click_on_LogoutButton();
	}

}
