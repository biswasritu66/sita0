package com.sita.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * this page we are storing all the page elements of tci sita homepage, booking centre, ao/bo,amenities
 * @author Ritu
 *
 */
public class HomePage extends WebdriverUtility{
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//WebDriver driver;
	//public HomePage(WebDriver driver) {
	//	PageFactory.initElements(driver,this);//for initializing webdriver we are creating this constructor.
	//}
	
	
	@FindBy(xpath="//tbody/tr[1]/td[5]/div[1]/div[2]/span[1]/a[1]//*[name()='svg']") WebElement ArrowButton;
	@FindBy(xpath="//tbody/tr[1]/td[6]/div[1]/div[2]/span[1]/a[1]//*[name()='svg']") WebElement ArrowButtonFHE;
	public void Click_ArrowButton()
	{
		ArrowButton.click();
		
	}
	public void Click_ArrowButtonFHE()
	{
		
		ArrowButtonFHE.click();
	}
	
	@FindBy(xpath="//span[normalize-space()='Confirm']") WebElement ConfirmButton;
	
	public void Click_ConfirmButton()
	{
		ConfirmButton.click();
	}
	@FindBy(xpath="//span[normalize-space()='Assign to File Handler']")WebElement AssignFile_Handler;
	public void AssignFile_Handler()
	{
		AssignFile_Handler.click();
	}
	@FindBy(xpath="//h5[normalize-space()='Naveen FHE']")WebElement NaveenFHE;
	public void NaveenFHE()
	{
		NaveenFHE.click();
	}
	@FindBy(xpath="//button[contains(@class,'assign-btn-selected')]")WebElement AssignButton;
	public void AssignButton()
	{
		AssignButton.click();
	}
	@FindBy(xpath="//span[normalize-space()='Send']")WebElement sendButton;
	public void sendButton()
	{
		
		sendButton.click();
	}
	@FindBy(xpath="//h5[@class='ant-typography _title back-option']") WebElement BackButton;
	public void BackButton()
	{
		BackButton.click();
	}
	@FindBy(xpath="//li[normalize-space()='Logout']")WebElement LogoutButton;
	public void Click_on_LogoutButton()
	{
	LogoutButton.click();
	}
	
	@FindBy(xpath="//span[normalize-space()='Booking Centre']")WebElement BookingCentre;
	public void Click_on_BookingCentre()
	{
		BookingCentre.click();
	}
	@FindBy(xpath="//div[contains(text(),'AO/BO Delegations')]")WebElement AO_BO_Delegations;
	public void go_to_AO_BO()
	{
		
		AO_BO_Delegations.click();
	}
	@FindBy(xpath="//button[@class='ant-btn booking-center-card-action book-btn']")WebElement Deligate_Button_for_AO_BO;
	public void Click_on_Deligate_Button()
	{
		Deligate_Button_for_AO_BO.click();
	}
	@FindBy(xpath="//button[@class='ant-btn monument-send-request-btn ']")WebElement Deligate_Button_for_Amenities;
	public void Click_on_Deligate_Button1()
	{
		Deligate_Button_for_Amenities.click();
	}
	@FindBy(xpath="//div[contains(@class,'booking-center-header-box amenities')]")WebElement Amenities;
	public void Click_on_Amenitiestab()
	{
		Amenities.click();
		
	}
	@FindBy(xpath="//button[@class='ant-btn btn-select']")WebElement select_Button;
	;
	public void Click_on_select_Button()
	{
		select_Button.click();
		
	}
	//moving cursor to No of units.
	
	@FindBy(xpath="//tbody/tr[2]/td[1]/div[1]/div[2]/div[1]/div[2]")WebElement Units;
	public void CopyingUnits()
	{
		Units.isSelected();
		
	}
	@FindBy(xpath="//span[normalize-space()='Delegate']")WebElement deligate_popup_button;
	public void deligate_popup_button()
	{
		deligate_popup_button.click();
		
	}
	//xpath for all the blank boxes and filling the box from excel
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div[2]/table/tbody/tr[2]/td[3]/div[1]/div[2]/input")WebElement blank_box;
	public void blank_box()
	{
		blank_box.sendKeys("10");
		
	}
	@FindBy(xpath="//span[normalize-space()='Save']")WebElement save_amenities;
	public void save_amenities()
	{
		save_amenities.click();
		
	}
	@FindBy(xpath="//span[normalize-space()='Confirm']")WebElement confirm_amenities;
	public void confirm_amenities()
	{
		confirm_amenities.click();
		
	}
	@FindBy(xpath="//tbody/tr[1]/td[5]/div[1]/div[2]/span[1]/a[1]//*[name()='svg']")WebElement Arrow_Button_BO ;
	public void Arrow_Button_BO()
	{
		Arrow_Button_BO.click();
		
	}
	@FindBy(xpath="//button[@class='ant-btn ant-btn-icon-only btn-icon lock-btn']//*[name()='svg']")WebElement Lock_Button ;
	public void Lock_Button()
	{
		Lock_Button.click();
		
	}
	@FindBy(xpath="//span[normalize-space()='Accept all']")WebElement Accept_all_amenities ;
	public void Accept_all_amenities()
	{
		Accept_all_amenities.click();
		
		
	}
	
	@FindBy(xpath="//span[normalize-space()='Accept']")WebElement Accept_popup ;

	public void Accept_popup()
	{
		
		Accept_popup.click();
		
	}

	
}















