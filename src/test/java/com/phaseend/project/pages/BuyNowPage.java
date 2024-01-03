package com.phaseend.project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyNowPage {
	
	@FindBy(xpath = "//input[@id='name']")
	public static WebElement name;

	@FindBy(xpath = "//input[@id='phoneNumber']")
	public static WebElement contactNo;

	@FindBy(xpath = "//input[@id='pinCode']")
	public static WebElement pinCode;
	
	
	@FindBy(xpath = "//input[@id='email']")
	public static WebElement email;

	@FindBy(xpath = "//div[@id='grouped-select']")
	public static WebElement dropDown;

	@FindBy(xpath = "//input[@id='contact_no']")
	public static WebElement contactNumberVeriry;

	@FindBy(xpath = "//img[@alt='Star Health Logo']")
	public static WebElement logo;
	
	//img[@class='jss341']
	//div[text()='Plans for Family']
	
	@FindBy(xpath = "//div[@class='our-plans_view-plan-btn__M0SE8']//button")
	public static WebElement familyplan;
	
	@FindBy(xpath = "//button[text()='Get Started']")
	public static WebElement getStarted;

	public BuyNowPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
		
	}
	
	 
	
	public void give_name(String fullname) throws InterruptedException {
		Thread.sleep(4000);
		name.sendKeys(fullname);
	}

	public void give_phno(String phno) throws InterruptedException {
		Thread.sleep(2000);
		contactNo.sendKeys(phno);
	}

	public void give_pin(String pin) throws InterruptedException {
		Thread.sleep(2000);
		pinCode.sendKeys(pin);
		//getStarted.click();
	}
	public void give_email(String Email) throws InterruptedException {
		Thread.sleep(2000);
		email.sendKeys(Email);
		
	}
	

	public void click_dropdown() throws InterruptedException {
		Thread.sleep(2000);
		//dropDown.click();
		familyplan.click();	
	}

	public String ContactNo_verify() throws InterruptedException {
		Thread.sleep(2000);
		String C_no = contactNumberVeriry.getAttribute("value");
		return C_no;
	}

	public void click_logo() throws InterruptedException {
		Thread.sleep(2000);
		logo.click();
	}
	//button[text()='Male']        click male
	//input[@id='motherinlaw']      click moterinlaw
	//input[@name='row-radio-buttons-group' and @value='No' ]          radiobutton no
	//button[@aria-label='Choose date']     click date field 
	//button[text()='1965'  choose year
	//input[@id=':r7:']     choose calendar textbox
	
	//span[text()='View Plans']
	
	//span[@class='ant-modal-close-x']
	
	//button[@aria-label='calendar view is open, switch to year view']
	
	//button[text()='13']
	
	//a[@class='MuiTypography-root MuiTypography-inherit MuiLink-root MuiLink-underlineAlways Header_logo__NotON relative css-10t6qxf']

}
