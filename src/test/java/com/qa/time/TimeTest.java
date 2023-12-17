package com.qa.time;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.TimePage;
import com.qa.testbase.TestBase;
import com.qa.utils.TestUtils;

public class TimeTest extends TestBase
{
	LoginPage loginPage ;
	HomePage homePage;
	TimePage timePage;
	String sheetname = "Sheet1";
	
	public TimeTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	public void initialiseBrowser() throws IOException
	{
		initialization();
		loginPage = new LoginPage();
		homePage = new HomePage();
		timePage = new TimePage();
	}
	
	@Test(dataProvider="getDataExcel")
	public void EmployeeTimeTest(String username, String passwrod) throws IOException, InterruptedException 
	{
		loginPage.login(username,passwrod);
		homePage.clickOnTime();
		
		timePage.ClickOnViewButton();	

		timePage.clickOnEditButton();
		
		timePage.clickOnCancelButton();
		
		timePage.clickOnAdminButton();
		
		
	}
	@DataProvider
	public  Object[][] getDataExcel() throws IOException, InvalidFormatException
	{
		 Object objects[][] = TestUtils.getTestData(sheetname);
		 return objects;
	}
	
	@AfterMethod
	public void tearDown()
	{
		 driver.quit();
	}
}
