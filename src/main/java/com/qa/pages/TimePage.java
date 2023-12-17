package com.qa.pages;

import java.io.IOException;

import org.apache.logging.log4j.plugins.Factory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.TestBase;

public class TimePage extends TestBase
{

	public TimePage() throws IOException
	{
		
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath ="//input[@placeholder='Type for hints...']")
	WebElement employeename;
	
	@FindBy(xpath = "//div[@role='listbox']//option[text()='Peter Mac Anderson']")
	WebElement firstemployee;
	
	@FindBy(xpath = "(//button[@type='button'][normalize-space()='View'])[1]")
	WebElement viewbuttnElement;
	
	@FindBy(xpath = "(//button[normalize-space()='Edit'])[1]")
	WebElement editbutton;
	
	
	
	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement savebutton;
	
	@FindBy(xpath = "(//button[normalize-space()='Cancel'])[1]")
	WebElement cancelbutton;
	
	@FindBy(xpath = "(//span[normalize-space()='Admin'])[1]")
	WebElement Adminbutton;
	
	public void EnterEmployeeName() 
	{
		employeename.sendKeys("Peter Mac Anderson");
	}
	
	public void selectEmployee() 
	{
		firstemployee.click();
	}
	
	public void ClickOnViewButton() {
		viewbuttnElement.click();
	}
	
	public void clickOnEditButton() {
		editbutton.click();
	}
	
	
     
     public void clickOnSaveButton() {
		savebutton.click();
	}
     
     public void clickOnCancelButton() {
 		cancelbutton.click();
 	}
     
     public void clickOnAdminButton() {
 		Adminbutton.click();
 	}
}
