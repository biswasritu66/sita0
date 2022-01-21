package com.sita.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sita.pages.WebdriverUtility;

public class Inventory_page_objects {
	WebDriver driver;
	public WebdriverUtility wb;
	public Inventory_page_objects(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[6]/div[1]/img[1]") WebElement ArrowButton_hotel;
	public void Click_Hotel_ArrowButton()
	{
		ArrowButton_hotel.click();
		
	}
	
	@FindBy(xpath="(//span[contains(text(),'Topup')])[1]") WebElement Topup_Button;
	public void Topup_Button()
	{
		Topup_Button.click();
		
	}
	@FindBy(xpath="//div[@id='3']") WebElement Date;
	public void Select_Date()
	{
		Date.click();
		
	}
	@FindBy(xpath="//span[normalize-space()='Topup']") WebElement Topup_Button1;
	public void Topup_Button1()
	{
		Topup_Button1.click();
		
	}
	@FindBy(xpath="//span[normalize-space()='Confirm']") WebElement confirm_Button;
	public void confirm_Button()
	{
		confirm_Button.click();
		
	}
	@FindBy(xpath="//span[normalize-space()='Hotel']") WebElement Hotel_filter;
	public void Hotel_name_filter()
	{
		Hotel_filter.click();
	}
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div/ul/li[3]/ul/div/div/div") WebElement Hotel_name;
	@FindBy(xpath="//div[@class='ant-select-item-option-content'][normalize-space()='Z_Needle- Royal Group']") WebElement Z_Needle_hotel;
	public void Hotel_name() throws Throwable
	{
		Hotel_name.click();
		Thread.sleep(2000);
		//Hotel_name.sendKeys("Z_Needle- Royal Group");
		Z_Needle_hotel.click();
		//StringBuilder Hotelname=new StringBuilder()
		//.append("Z_Needle- Royal Group");
		//Hotel_name.sendKeys(Hotelname);
		//Thread.sleep(5000);
		//wb.pressEnterKey();
	}
}

















