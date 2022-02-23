package com.sita.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.util.List;

import com.sita.pageObjects.HomePage;
import com.sita.pageObjects.Select_amenities;
import com.sita.pages.BaseClass_dev;
import com.sita.pages.LoginPage;
import com.sita.pages.WebdriverUtility;
public class deligation_of_amenities_to_BO extends BaseClass_dev {
	
	public HomePage Hp = new HomePage(driver);

	@Test(priority=1)
	public void supervisor_login_and_assigning_fhe()
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
		logger=report.createTest("Assign Fhe Success");
		Hp.AssignButton();
		Hp.sendButton();
		Hp.BackButton();
		//loging out supervisor
		// moving mouse cursor to "logout" dropdown and clicking it.
		WebElement ele = driver.findElement(By.xpath("//img[@class='ant-dropdown-trigger menu-avatar']"));
		wb.mouseOver(driver, ele);
		Hp.Click_on_LogoutButton();
		logger=report.createTest("Logout Success");
	}
	@Test(priority = 2)
	public void fhe_distribution() throws IOException, InterruptedException  
	{
		logger=report.createTest("Login as FHE");
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
		//filling invalid nos of units
		{
			
			Sa.Z_mumbai_units(excel.getStringData("Amenities",1,2), excel.getStringData("Amenities",2,2),
				excel.getStringData("Amenities",3,2));
		
			String expectedHeading = "more than allowed limit";
    	//Storing the text of the heading in a string
    	String heading = driver.findElement(By.xpath("//div[@class='error-msg']")).getText();
    	if(expectedHeading.equalsIgnoreCase(heading))
          	System.out.println("The expected heading is same as actual heading --- "+heading);
    	else
          	System.out.println("The expected heading doesn't match the actual heading --- "+heading);
		}
		logger=report.createTest("more than allocated unit not accepted");
		//valid no of units
		Sa.Z_mumbai_units(excel.getStringData("Amenities",1,1), excel.getStringData("Amenities",2,1),
				excel.getStringData("Amenities",3,1));
		//z_puri_units
		Sa.Z_Puri_units(excel.getStringData("Amenities",6,1), excel.getStringData("Amenities",7,1),
				excel.getStringData("Amenities",8,1));
		
		Hp.confirm_amenities();
		Hp.File_Upload();
		//Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\Ritu\\Documents\\needle_file_upload\\fileupload1.exe");
		//Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,1300)");
		Hp.deligate_popup_button();
		Hp.BackButton();
		// moving mouse cursor to "logout" dropdown and clicking it.
		WebElement ele = driver.findElement(By.xpath("//img[@class='ant-dropdown-trigger menu-avatar']"));
		wb.mouseOver(driver, ele);
		Hp.Click_on_LogoutButton();
		logger=report.createTest("Logout from fhe");
	}
	@Test(priority = 3)
	public void Bo_amenities_list() throws InterruptedException 
	{
		logger=report.createTest("Login as BO");
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
		logger=report.createTest("accecpt all amenities");
		Thread.sleep(3000);
		Hp.BackButton();
		WebElement ele1 = driver.findElement(By.xpath("//img[@class='ant-dropdown-trigger menu-avatar']"));
		wb.mouseOver(driver, ele1);
		Hp.Click_on_LogoutButton();
		logger=report.createTest("logout from Bo");
		
	}
}


	//<include name="supervisor_login_and_assigning_fhe"></include>
	//<include name="fhe_distribution"></include>
	
//<include name="supervisor_login_and_assigning_fhe"></include>
	
	
	

