package com.sita.testcases;


import java.util.concurrent.TimeUnit;
import com.sita.pages.WebdriverUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sita.pageObjects.CreateUser;

import com.sita.utility.ExcelUtils;

public class Create_Supervisor_fhes {
	
	WebDriver driver=null;
	
	@BeforeTest
	public void setupTest() throws InterruptedException {
		CreateUser Cu= new CreateUser(driver);
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://sita-usermgmt-dev-demo.s3-website.ap-south-1.amazonaws.com/user");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("admin@testsita.com");
		driver.findElement(By.id("password")).sendKeys("Test@123");
		driver.findElement(By.xpath("//span[normalize-space()='Login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary']")).click();
		//Cu.click_on_AddUsers();
		Thread.sleep(3000);
	}
	

	@Test(dataProvider="Inventory_data",priority=1)
	public void customer_details( String Name, String EmployeeCode, String EmailId, String PhoneNumber) {
		System.out.println(Name+" "+EmployeeCode+" "+EmailId+" "+PhoneNumber+"");
		
		driver.findElement(By.id("fullName")).sendKeys(Name);
		driver.findElement(By.id("employeeId")).sendKeys(EmployeeCode);
		driver.findElement(By.id("email")).sendKeys(EmailId);
		driver.findElement(By.id("phoneNumber")).sendKeys(PhoneNumber);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/form[1]/div[1]/div[2]/div[2]/div[1]/div[1]/span[1]/input[1]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'TCI India')]")).click();
		//location
		 WebdriverUtility wu=new WebdriverUtility();
		 WebElement Rollprofile = driver.findElement(By.xpath("/span[normalize-space()='Role Profile']"));
		 wu.scrollToWebElement(driver, Rollprofile);
		 
		 

	}
	
	@DataProvider(name="Inventory_data")
	public Object[][]  getData() {
		String excelPath = "C:\\Users\\Ritu\\git\\needle\\com.Sita.Framework0\\TestData\\Data.xlsx";
		Object data[][] = testData(excelPath, "Inventory_data");
		return data;
	}
	
	
	public  Object[][] testData(String excelPath, String sheetName) {
		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
		int rowCount = excel.getRowCount();
		int colCount =  excel.getColCount();
		
		Object data[][] = new Object[rowCount-1][colCount];
		//i is for rowcount
		//j is for column count
		for(int i=1;i<rowCount;i++) {
			for(int j=0;j<colCount;j++) {
				
				String cellData = excel.getCellDataString(i, j);
			//	System.out.print(cellData+"");
				data[i-1][j]=cellData;
			}
			System.out.println();
		}
		return data;
	}
}
















