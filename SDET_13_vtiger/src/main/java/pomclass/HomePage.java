package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtiltity.WebDriverUtility;

public class HomePage extends WebDriverUtility{
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Leads")
	private WebElement leadLink;
	
	public WebElement getLeadLink() {
		return leadLink;
	}

	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminstratorIMG;
	
	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signOutLink;

	public WebElement getAdminstratorIMG() {
		return adminstratorIMG;
	}

	public WebElement getSignOutLink() {
		return signOutLink;
	}

	/**
	 * click on Lead link
	 */
	public LeadPage clickLead() {
		waitForElementVisibility(driver, leadLink);
		leadLink.click();
		return new LeadPage(driver);
	}
	/**
	 *gnout from app
	 */
	public void signOut() {
		mouseOver(driver, adminstratorIMG);
		signOutLink.click();
	}

}
