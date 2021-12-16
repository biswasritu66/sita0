package com.sita.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

import com.sita.pages.WebdriverUtility;

/**
 * all the page elements of create user,supervisor,fhe.
 * @author Ritu
 *
 */
public class CreateUser extends WebdriverUtility{
		WebDriver driver;
		public CreateUser(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		//clicking add user button
		@FindBy(xpath="//button[@class='ant-btn ant-btn-primary']") WebElement AddUsers;
		public void click_on_AddUsers()
		{
			
			AddUsers.click();
			
		}
		//clicking all the user details blank boxes
		@FindBy(id="fullName") WebElement Name;
		
		@FindBy(id="employeeId") WebElement employeeCode;
		
		@FindBy(id="email") WebElement email;
		
		@FindBy(id="phoneNumber") WebElement phNumber;
		
		public void User_Basic_Details(String FullName,String ECode,String emailid,String phoneNumber)
		{
			Name.sendKeys(FullName);
			employeeCode.sendKeys(ECode);
			email.sendKeys(emailid);
			phNumber.sendKeys(phoneNumber);
		}
		//clicking and selecting orga.nizational unit
		@FindBy(xpath="/html[1]/body[1]/div[1]/section[1]/div[1]/form[1]/div[1]/div[2]/div[2]/div[1]/div[1]/span[1]/input[1]") WebElement org_Unit;
		@FindBy(xpath="//div[contains(text(),'TCI India')]") WebElement TCI;
		public void org_Unit()
		{
			org_Unit.click();
			TCI.click();
		}
		//clicking location dropdown and selecting agra
		@FindBy(xpath="/html[1]/body[1]/div[1]/section[1]/div[1]/form[1]/div[1]/div[2]/div[3]/div[1]/div[1]/span[1]/input[1]") WebElement Location;
		@FindBy(xpath="//div[contains(text(),'Agra')]") WebElement Agra;
		///html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[8]/div[1]
		public void Location()
		{
			Location.click();
			Agra.click();
		}
		//scrolling page till add Role profile
		@FindBy(xpath="/html[1]/body[1]/div[1]/section[1]/div[1]/form[1]/div[2]/div[3]/div[1]/button[1]/span[1]") WebElement Role_profile;
		public void scroll_to_addnewbutton_click()
		{
			 WebdriverUtility wu=new WebdriverUtility();
			 wu.scrollToWebElement(driver, Role_profile);
			 Role_profile.click();
			
		}
		//clicking "add new" button 
		@FindBy(xpath="/html[1]/body[1]/div[1]/section[1]/div[1]/form[1]/div[2]/div[3]/div[1]/button[1]/span[1]") WebElement click_addnewbutton;
		public void click_add_new_button()
		{
			click_addnewbutton.click();
			
		}
		@FindBy(xpath="/html[1]/body[1]/div[1]/section[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/span[1]/input[1]") WebElement Department;
		@FindBy(xpath="//div[contains(text(),'Placement')]") WebElement placement;
		public void click_and_select_department()
		{
			Department.click();
			placement.click();
			
		}
		@FindBy(xpath="/html[1]/body[1]/div[1]/section[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/span[1]/input[1]") WebElement Roles;
		public void click_select_roles()
		{
			Roles.click();
			
		}
		@FindBy(xpath="//div[contains(text(),'SUPERVISOR')]") WebElement supervisor;
		public void select_supervisor()
		{
			supervisor.click();
			
		}
		@FindBy(xpath="//div[contains(text(),'FHE')]") WebElement FHE;
		public void select_FHE()
		{
			FHE.click();
			
		}
		
		//scrolling page till FIT,GIT,Series and selecting
		@FindBy(xpath="//input[@value='FIT']") WebElement FIT;
		@FindBy(xpath="//input[@value='GIT']") WebElement GIT;
		@FindBy(xpath="//input[@value='SERIES']") WebElement SERIES;
		public void scroll_and_select_FIT_GIT_SERIES()
		{
			 WebdriverUtility wu=new WebdriverUtility();
			 wu.scrollToWebElement(driver, FIT);
			 FIT.click();
			 GIT.click();
			 SERIES.click();
		}
		public void scroll_and_select_FIT()
		{
			WebdriverUtility wu=new WebdriverUtility();
			 wu.scrollToWebElement(driver, FIT);
			FIT.click();
		}
		@FindBy(xpath="//button[@type='submit']") WebElement Create_user;
		public void click_Create_user()
		{
			Create_user.click();
			
		}
		@FindBy(xpath="//div[normalize-space()='Admin Console']") WebElement Admin_Console;
		public void scroll_to_Admin_Console()
		{
			Admin_Console.click();
			
		}
		////clicking on active From calender & selecting todays date
		@FindBy(xpath="//input[@placeholder='Active From']") WebElement Active_form;
		@FindBy(xpath="//a[@class='ant-picker-today-btn']") WebElement click_today;
		public void click_calender1()
		{
			Active_form.click();
			click_today.click();
		}
		//clicking on active till calender
		@FindBy(xpath="//input[@placeholder='Active Till']") WebElement Active_till;
		public void click_calender2()
		{
			Active_till.click();
			
		}
		
			
			
		}



















