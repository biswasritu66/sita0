package com.sita.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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
		@FindBy(xpath="//span[normalize-space()='Add Users']") WebElement AddUsers;
		
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
		@FindBy(xpath="/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/span[1]/input[1]") WebElement org_Unit;
		@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]") WebElement TCI;
		public void org_Unit()
		{
			org_Unit.click();
			TCI.click();
		}
		//clicking location dropdown and selecting agra
		@FindBy(xpath="/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/span[1]/input[1]") WebElement Location;
		@FindBy(xpath="/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]") WebElement Agra;
		///html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[8]/div[1]
		public void Location()
		{
			Location.click();
			Agra.click();
		}
		//scrolling page till add new button
		@FindBy(xpath="/html[1]/body[1]/div[1]/section[1]/div[1]/div[2]/div[3]/div[1]/button[1]/span[1]") WebElement addnewbutton;
		public void scroll_to_add_new_button()
		{
			 WebdriverUtility wu=new WebdriverUtility();
			 wu.scrollToWebElement(driver, addnewbutton);
			
		}
		//clicking "add new" button 
		@FindBy(xpath="//button[@ant-click-animating-without-extra-node='false']//span[@class='edit-create'][normalize-space()='Add New']") WebElement click_addnewbutton;
		public void click_add_new_button()
		{
			click_addnewbutton.click();
			
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
















