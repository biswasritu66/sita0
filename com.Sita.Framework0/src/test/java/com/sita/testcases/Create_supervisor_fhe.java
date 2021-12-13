package com.sita.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.sita.pageObjects.CreateUser;
import com.sita.pages.BaseClass;
import com.sita.pages.LoginPage;

/**
 * for adding supervisor and fhe
 * @author Ritu
 *
 */
public class Create_supervisor_fhe extends BaseClass {
	
	@Test(priority = 1)
	public void loginApp() {

		logger = report.createTest("Login to Sita_Create_User");

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

		loginPage.loginToAPP(excel.getStringData("Login", 1, 0), excel.getStringData("Login", 1, 1));
		
		logger.pass("Login Success");
	}
	
	@Test(priority = 2)
	public void click_on_AddUsers() 

	{
		CreateUser Cu= new CreateUser(driver);
		Cu.click_on_AddUsers();
		logger.pass("AddUsers_clicked");
		//filling all the supervisor details from the excel sheet
		
	}
	
	
	 
	@Test(priority =3 )
	public void Supervisor_Basic_Details() 

	{
		CreateUser Cu= new CreateUser(driver);
		Cu.User_Basic_Details(excel.getStringData("Inventory_data",1,1), excel.getStringData("Inventory_data",1,2),
			excel.getStringData("Inventory_data",1,3), excel.getStringData("Inventory_data",1,4));
		Cu.org_Unit();
		Cu.Location();
	}
	
/*	@Test(priority = 4)
	public void scroll_and_click_on_add_new_button_select_dept_and_roles() 

	{
		CreateUser Cu= new CreateUser(driver);
		Cu.scroll_to_Role_Profile();
		Cu.click_add_new_button();
		Cu.click_and_select_department();
		Cu.click_select_roles();
		Cu.select_supervisor();
		
	}
	
	@Test(priority = 5)
	public void click_on_FIT_GIT_SERIES() throws InterruptedException

	{
		CreateUser Cu= new CreateUser(driver);
		Cu.scroll_and_select_FIT_GIT_SERIES();
		//Cu.click_calender1();//clicking on active From calender & selecting todays date
		//Cu.click_calender2();////clicking on active till calender
		Cu.click_Create_user();
		
	}
	@Test(priority = 6)
	public void create_fhes() throws InterruptedException

	{
		CreateUser Cu= new CreateUser(driver);
		Cu.scroll_to_Admin_Console();
		Cu.click_on_AddUsers();
		Cu.User_Basic_Details(excel.getStringData("Inventory_data",2,1), excel.getStringData("Inventory_data",2,2),
				excel.getStringData("Inventory_data",2,3), excel.getStringData("Inventory_data",2,4));
		Cu.org_Unit();
		Cu.Location();
		Cu.scroll_to_Role_Profile();
		Cu.click_add_new_button();
		Cu.click_and_select_department();
		Cu.click_select_roles();
		Cu.select_FHE();
		Cu.scroll_and_select_FIT();
		Cu.click_Create_user();
		Thread.sleep(5000);
		
		*/
		
		
		
	}
	
	
	
	
	
	
	
	
