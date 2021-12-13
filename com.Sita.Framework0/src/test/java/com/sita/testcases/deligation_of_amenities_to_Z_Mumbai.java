package com.sita.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import java.util.List;

import com.sita.pageObjects.Select_amenities;
import com.sita.pages.BaseClass;
import com.sita.pages.HomePage;
import com.sita.pages.LoginPage;
import com.sita.pages.WebdriverUtility;
import com.sita.pages.HomePage;
public class deligation_of_amenities_to_Z_Mumbai extends BaseClass {
	
	public HomePage Hp = new HomePage(driver);

	@Test(priority=1)
	public void loginApp() 
	{
		
		logger=report.createTest("Login to Sita");
		
		LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class);
		
		logger.info("Starting Application");
		
		loginPage.loginToAPP(excel.getStringData("Login", 0, 0),excel.getStringData("Login", 0, 1));
		
		logger.pass("Login Success");
		
	}
	
	@Test(priority=2)
	
	public void navigate_to_homepage_click_on_ArrowButton1 () throws InterruptedException 
	
	{
		
		logger=report.createTest("click_on_ArrowButton");
		HomePage Hp = new HomePage(driver);
		//WebdriverUtility wb = new WebdriverUtility();
		//wb.waitUntilPageLoad(driver);
		Hp.Click_ArrowButton();
		logger.pass("ArrowButton_clicked");
	
	}
	@Test(priority = 3)
	public void ConfirmButton() {
		
		logger = report.createTest("click_on_Confirm_Button");
		HomePage Hp = new HomePage(driver);
		Hp.Click_ConfirmButton();

	}

	@Test(priority = 4)
	public void AssignFHE() {
		HomePage Hp = new HomePage(driver);
		Hp.AssignFile_Handler();
		Hp.NaveenFHE();
		Hp.AssignButton();
		Hp.sendButton();
		

	}
	
	
	@Test(priority=5)
	public void Click_on_BackButton()
	{
		HomePage Hp = new HomePage(driver);
		Hp.BackButton();
	}
	
	 @Test(priority=6)
	public void Logout_Superviser()
	{
		//moving mouse cursor to "logout" dropdown and clicking it.
				
				WebElement ele=driver.findElement(By.xpath("/html/body/div[1]/section/header/div/div[3]/ul/li[6]/img"));
				WebdriverUtility wb=new WebdriverUtility();
				wb.mouseOver(driver, ele);
				HomePage Hp = new HomePage(driver);
				Hp.Click_on_LogoutButton();
	}
	
	
	@Test(priority = 7)
	public void loginFHE() {
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.loginToAPP(excel.getStringData("LoginFHE", 0, 0), excel.getStringData("LoginFHE", 0, 1));

	}

	@Test(priority = 8)

	public void ArrowButtonofFHE() 

	{
		
		HomePage Hp = new HomePage(driver);
		Hp.Click_ArrowButtonFHE();
	}

	@Test(priority = 9)
	public void BookingCentre() {
		HomePage Hp = new HomePage(driver);
		Hp.Click_on_BookingCentre();
	}

	@Test(priority = 10)
	public void Amenities() {
		HomePage Hp = new HomePage(driver);
		Hp.Click_on_Amenitiestab();

	}

	@Test(priority = 11)
	public void Amenities_List() {

		List<WebElement> allbuttons = driver.findElements(By.xpath("//button[@class='ant-btn btn-select ']"));
		for (WebElement selectbutton : allbuttons) {
			selectbutton.click();
		}
	}

	@Test(priority = 12)
	public void Deligation()  {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//Scroll Down
		js.executeScript("window.scrollBy(0,1500)");
		
		//Scroll Up
		js.executeScript("window.scrollBy(0,-3000)");
		HomePage Hp = new HomePage(driver);
		Hp.Click_on_Deligate_Button1();
		
	}
	@Test(priority = 13)
	public void Select_Amenities_and_confirm() throws InterruptedException {
		Select_amenities Select_amenities=PageFactory.initElements(driver,Select_amenities.class);
		Select_amenities.Z_mumbai_units(excel.getStringData("Amenities", 1, 1),excel.	getStringData("Amenities", 2, 1),excel.getStringData("Amenities", 3, 1),excel.getStringData("Amenities", 4, 1));
		
		HomePage Hp = new HomePage(driver);
		
		Hp.confirm_amenities();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//Scroll Down
		js.executeScript("window.scrollBy(0,1500)");
		
		
		Hp.deligate_popup_button();
		
	
	}

	@Test(priority=14)
	public void Click_on_BackButton1()
	{
		HomePage Hp = new HomePage(driver);
		Hp.BackButton();
	}
	
	 @Test(priority=15)
	public void Logout_FHE()
	{
		//moving mouse cursor to "logout" dropdown and clicking it.
				
				WebElement ele=driver.findElement(By.xpath("/html/body/div[1]/section/header/div/div[3]/ul/li[6]/img"));
				WebdriverUtility wb=new WebdriverUtility();
				wb.mouseOver(driver, ele);
				HomePage Hp = new HomePage(driver);
				Hp.Click_on_LogoutButton();
	}

	 @Test(priority = 16)
		public void login_as_BO()  {
			LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
			loginPage.loginToAPP(excel.getStringData("LoginBo", 0, 0), excel.getStringData("LoginFHE", 0, 1));
			
			}
	 @Test(priority = 17)
		public void click_Arrow_Button_BO_go_to_amenities_tab_lock_file() throws InterruptedException{
		 HomePage Hp = new HomePage(driver);
		 Hp.Arrow_Button_BO();
		
		 Hp.Click_on_Amenitiestab();
		 Hp.Lock_Button();
		 Thread.sleep(3000);
		 
		 
	 }
		 @Test(priority = 18)
		 public void click_on_accecpt_all() throws InterruptedException {
		 HomePage Hp = new HomePage(driver);
		 Hp.Accept_all_amenities();
		 Thread.sleep(3000);
		 
	 }	
		 @Test(priority = 19)
		 public void click_on_accecpt_popup() throws InterruptedException {
		 HomePage Hp = new HomePage(driver);
		 Hp.Accept_popup();
		 
	
		 }
		
	
		
	 
}

	


	
	
	
	
	
	
	

