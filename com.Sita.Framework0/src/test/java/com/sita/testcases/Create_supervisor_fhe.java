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
	public void click_on_AddUsers() throws InterruptedException 

	{
		CreateUser Cu= new CreateUser(driver);
		Cu.click_on_AddUsers();
		logger.pass("AddUsers_clicked");
		//filling all the supervisor details from the excel sheet
		Cu.User_Basic_Details(excel.getStringData("Inventory_data",1,0), excel.getStringData("Inventory_data",1,1),
				excel.getStringData("Inventory_data",1,2), excel.getStringData("Inventory_data",1,3));
			Cu.org_Unit();
			Cu.Location();
		//scroll_and_click_on_add_new_button_select_dept_and_roles
			Cu.scroll_to_addnewbutton_click();
			//Cu.click_add_new_button();
				
			Cu.click_and_select_department();
			Cu.click_select_roles();
			Cu.select_supervisor();
			//click_on_FIT_GIT_SERIES
			Cu.scroll_and_select_FIT_GIT_SERIES();
			
			Cu.click_Create_user();
			
			
	}
	
	@Test(priority = 3)
	public void create_fhes() throws InterruptedException

	{
		
		CreateUser Cu= new CreateUser(driver);
		for(int i=0;i<=5;i++)
		{
		//Cu.scroll_to_Admin_Console();
		Cu.click_on_AddUsers();
		//Thread.sleep(5000);
		Cu.User_Basic_Details(excel.getStringData("Inventory_data",2,0), excel.getStringData("Inventory_data",2,1),
				excel.getStringData("Inventory_data",2,2), excel.getStringData("Inventory_data",2,3));
		Cu.org_Unit();
		Cu.Location();
		Cu.scroll_to_addnewbutton_click();
		//Cu.click_add_new_button();
		Cu.click_and_select_department();
		Cu.click_select_roles();
		Cu.select_FHE();
		Cu.scroll_and_select_FIT();
		Cu.click_Create_user();
		
		}
	}
		
		
		
	}