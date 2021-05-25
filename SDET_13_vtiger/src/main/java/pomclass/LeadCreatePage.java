package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LeadCreatePage {
	public WebDriver driver;
	public LeadCreatePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	} 
	
	@FindBy(name = "lastname")
	private WebElement lastName;
	@FindBy(name = "company")
	private WebElement company;
	@FindBy(id = "email")
	private WebElement emailId;
	@FindBy(id="secondaryemail")
	private WebElement semail;
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement savebt;
	@FindBy(id = "mobile")
	private WebElement mobileNo;
	@FindBy(id = "phone")
	private WebElement phoneNo;
	
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getCompany() {
		return company;
	}
	public WebElement getEmailId() {
		return emailId;
	}
	public WebElement getSemail() {
		return semail;
	}
	public WebElement getSavebt() {
		return savebt;
	}
	public WebElement getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(WebElement mobileNo) {
		this.mobileNo = mobileNo;
	}
	public WebElement getPhoneNo() {
		return phoneNo;
	}
	
	/*
	 * this method is used to crearte lead
	 */
	public boolean creatlead(String LastName,String Company,String Email,String SEmail) {
		lastName.sendKeys(LastName);
		company.sendKeys(Company);
		emailId.sendKeys(Email);
		semail.sendKeys(SEmail);
		savebt.click();
		String acM=driver.switchTo().alert().getText();
		String exM="Please enter a valid Email (EMAIL)";
		driver.switchTo().alert().accept();
		Assert.assertEquals(acM, exM);
		return true;
	}
	/*
	 * this method is used for create lead with mobile and phone number
	 * 
	 */
	public CreatedLeadPage createLeadWithMobNo(String lastname,String comName, String mob,String pNo) {
		lastName.sendKeys(lastname);
		company.sendKeys(comName);
		mobileNo.sendKeys(mob);
		phoneNo.sendKeys(pNo);
		savebt.click();
		return new CreatedLeadPage(driver);
		
		
	}
	/**
	 * this method is used for creat lead without filing all the fields
	 */
	public boolean withoutFillingTF() {
		savebt.click();
		String aMessage=driver.switchTo().alert().getText();
		String eMessage="Last Name cannot be empty";
		driver.switchTo().alert().accept();
		Assert.assertTrue(aMessage.equalsIgnoreCase(eMessage));
		return true;
	}
	
	

}
