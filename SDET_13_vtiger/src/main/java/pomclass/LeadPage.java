package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadPage {
	WebDriver driver;
	public LeadPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//img[@title='Create Lead...']")
	private WebElement leadImg;
	
	
	public WebElement getLeadImg() {
		return leadImg;
	}
	/*
	 * this method is used to click leadImgPlus
	 * 
	 */
	public LeadCreatePage clickleadImg() {
		leadImg.click();
		return new LeadCreatePage(driver);
				
	}
	

}
