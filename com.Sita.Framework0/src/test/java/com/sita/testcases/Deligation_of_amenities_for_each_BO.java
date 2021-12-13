
package com.sita.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.sita.pageObjects.Select_amenities;
import com.sita.pages.BaseClass;
import com.sita.pages.HomePage;
import com.sita.pages.LoginPage;
import com.sita.pages.WebdriverUtility;

public class Deligation_of_amenities_for_each_BO extends BaseClass {
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
	public void navigate_to_homepage_click_on_ArrowButton1() 
	{
		logger = report.createTest("click_on_ArrowButton");
		HomePage Hp = new HomePage(driver);
		Hp.Click_ArrowButton();
		logger.pass("ArrowButton_clicked");
	}

	@Test(priority = 3)
	public void ConfirmButton() 
	{
		logger = report.createTest("click_on_Confirm_Button");
		HomePage Hp = new HomePage(driver);
		Hp.Click_ConfirmButton();
	}

	@Test(priority = 4)
	public void AssignFHE() 
	{
		HomePage Hp = new HomePage(driver);
		Hp.AssignFile_Handler();
		Hp.NaveenFHE();
		Hp.AssignButton();
		Hp.sendButton();
	}

	@Test(priority = 5)
	public void Click_on_BackButton() 
	{
		HomePage Hp = new HomePage(driver);
		Hp.BackButton();
	}

	@Test(priority = 6)
	public void Logout_Superviser() 
	{
		// moving mouse cursor to "logout" dropdown and clicking it.
		WebElement ele = driver.findElement(By.xpath("/html/body/div[1]/section/header/div/div[3]/ul/li[6]/img"));
		WebdriverUtility wb = new WebdriverUtility();
		wb.mouseOver(driver, ele);
		HomePage Hp = new HomePage(driver);
		Hp.Click_on_LogoutButton();
	}

	@Test(priority = 7)
	public void loginFHE() 
	{
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.loginToAPP(excel.getStringData("LoginFHE", 0, 0), excel.getStringData("LoginFHE", 0, 1));

	}

	@Test(priority = 8)

	public void ArrowButton_of_FHE()
	{
		// Thread.sleep(5000);
		HomePage Hp = new HomePage(driver);
		Hp.Click_ArrowButtonFHE();
	}

	@Test(priority = 9)
	public void Booking_Centre() 
	{
		HomePage Hp = new HomePage(driver);
		Hp.Click_on_BookingCentre();
	}

	@Test(priority = 10)
	public void Amenities() 
	{
		HomePage Hp = new HomePage(driver);
		Hp.Click_on_Amenitiestab();
	}

	@Test(priority = 11)
	public void Amenities_List_select_button() 
	{
		List<WebElement> allbuttons = driver.findElements(By.xpath("//button[@class='ant-btn btn-select ']"));
		for (WebElement selectbutton : allbuttons) 
		{
			selectbutton.click();
		}
	}

	@Test(priority = 12)
	public void Deligation() 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Scroll Down
		js.executeScript("window.scrollBy(0,1500)");
		// Scroll Up
		js.executeScript("window.scrollBy(0,-3000)");
		HomePage Hp = new HomePage(driver);
		Hp.Click_on_Deligate_Button1();
	}
	
	//here clicking every blank boxes in selecting amenitie quantities from excel sheet.
	@Test(priority = 13)
	public void Select_Amenities_save_and_confirm()
	{
		Select_amenities Sa = PageFactory.initElements(driver, Select_amenities.class);
		Sa.Z_mumbai_units(excel.getStringData("Amenities",1,1), excel.getStringData("Amenities",2,1),
				excel.getStringData("Amenities",3,1), excel.getStringData("Amenities",4,1));
		Sa.Z_Puri_units(excel.getStringData("Amenities", 6, 1), excel.getStringData("Amenities",7,1),
				excel.getStringData("Amenities", 8,1), excel.getStringData("Amenities", 9, 1));
		Sa.Z_Bhubneswar_units(excel.getStringData("Amenities",11,1),excel.getStringData("Amenities",12,1),
				excel.getStringData("Amenities",13,1),excel.getStringData("Amenities",14,1));
		
		HomePage Hp = new HomePage(driver);
		Hp.confirm_amenities();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
		Hp.deligate_popup_button();
	}
	
	@Test(priority = 14)
	public void Click_on_BackButton1() 
	{
		HomePage Hp = new HomePage(driver);
		Hp.BackButton();
	}

	@Test(priority = 15)
	public void Logout_FHE() 
	{
		// moving mouse cursor to "logout" dropdown and clicking it.

		WebElement ele = driver.findElement(By.xpath("/html/body/div[1]/section/header/div/div[3]/ul/li[6]/img"));
		WebdriverUtility wb = new WebdriverUtility();
		wb.mouseOver(driver, ele);
		HomePage Hp = new HomePage(driver);
		Hp.Click_on_LogoutButton();
	}

	@Test(priority = 16)
	public void login_as_Z_Mumbai() 
	{
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.loginToAPP(excel.getStringData("LoginBo", 0, 0), excel.getStringData("LoginBo", 0, 1));

	}

	@Test(priority = 17)
	public void click_Arrow_Button_BO_go_to_amenities_tab_lock_file1() 
	{
		HomePage Hp = new HomePage(driver);
		Hp.Arrow_Button_BO();
		Hp.Click_on_Amenitiestab();
	}
	
	@Test(priority = 18)
	public void lock_file() {
		HomePage Hp = new HomePage(driver);
		Hp.Lock_Button();
		wu.waitUntilPageLoad(driver);
	}

	@Test(priority = 19)
	public void click_on_accecpt_all1() throws InterruptedException {
		HomePage Hp = new HomePage(driver);
		Hp.Accept_all_amenities();
		wu.waitUntilPageLoad(driver);
		//Thread.sleep(5000);
	}

	@Test(priority = 20)
	public void click_on_accecpt_popup1()  {
		HomePage Hp = new HomePage(driver);
		Hp.Accept_popup();
		
	}

	@Test(priority = 21)
	public void Click_on_BackButton2() {
		HomePage Hp = new HomePage(driver);
		Hp.BackButton();
	}

	@Test(priority = 22)
	public void Logout_Z_Mumbai() 
	{
		WebElement ele = driver.findElement(By.xpath("/html/body/div[1]/section/header/div/div[3]/ul/li[6]/img"));
		WebdriverUtility wb = new WebdriverUtility();
		wb.mouseOver(driver, ele);
		HomePage Hp = new HomePage(driver);
		Hp.Click_on_LogoutButton();
	}

	@Test(priority = 23)
	public void login_as_Z_bhubneswar() 
	{
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.loginToAPP(excel.getStringData("LoginBo", 1, 0), excel.getStringData("LoginBo", 1, 1));
	}

	@Test(priority = 24)
	public void click_Arrow_Button_BO_go_to_amenities_tab2() {
		HomePage Hp = new HomePage(driver);
		Hp.Arrow_Button_BO();
		
		Hp.Click_on_Amenitiestab();
	}
	
	@Test(priority = 25)
	public void lock_file1()  {
		HomePage Hp = new HomePage(driver);
		Hp.Lock_Button();
		wu.waitUntilPageLoad(driver);
	}

	@Test(priority = 26)
	public void click_on_accecpt_all2() 
	{
		HomePage Hp = new HomePage(driver);
		Hp.Accept_all_amenities();
	}

	@Test(priority = 27)
	public void click_on_accecpt_popup2()  
	{
		HomePage Hp = new HomePage(driver);
		Hp.Accept_popup();
	}

	@Test(priority = 28)
	public void Click_on_BackButton3()
	{
		HomePage Hp = new HomePage(driver);
		Hp.BackButton();
	}

	@Test(priority = 29)
	public void Logout_BO_Z_Bhubneswar() 
	{
		WebElement ele = driver.findElement(By.xpath("/html/body/div[1]/section/header/div/div[3]/ul/li[6]/img"));
		WebdriverUtility wb = new WebdriverUtility();
		wb.mouseOver(driver, ele);
		HomePage Hp = new HomePage(driver);
		Hp.Click_on_LogoutButton();
	}

	@Test(priority = 30)
	public void login_as_Z_Puri() 
	{
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.loginToAPP(excel.getStringData("LoginBo", 2, 0), excel.getStringData("LoginBo", 2, 1));
	}

	@Test(priority = 31)
	public void click_Arrow_Button_BO_go_to_amenities_tab3() 
	{
		HomePage Hp = new HomePage(driver);
		Hp.Arrow_Button_BO();
		Hp.Click_on_Amenitiestab();
	}
	@Test(priority = 32)
	public void lock_file2()  
	{
		HomePage Hp = new HomePage(driver);
		Hp.Lock_Button();
		wu.waitUntilPageLoad(driver);
	}


	@Test(priority = 33)
	public void click_on_accecpt_all3()  
	{
		HomePage Hp = new HomePage(driver);
		Hp.Accept_all_amenities();
		wu.waitUntilPageLoad(driver);	
	}

	@Test(priority = 34)
	public void click_on_accecpt_popup3()
	{
		HomePage Hp = new HomePage(driver);
		Hp.Accept_popup();
	}

	@Test(priority = 35)
	public void Click_on_BackButton4()
	{
		HomePage Hp = new HomePage(driver);
		Hp.BackButton();
	}

	@Test(priority = 36)
	public void Logout_Z_Puri()
	{
		WebElement ele = driver.findElement(By.xpath("/html/body/div[1]/section/header/div/div[3]/ul/li[6]/img"));
		WebdriverUtility wb = new WebdriverUtility();
		wb.mouseOver(driver, ele);
		HomePage Hp = new HomePage(driver);
		Hp.Click_on_LogoutButton();
	}

}
