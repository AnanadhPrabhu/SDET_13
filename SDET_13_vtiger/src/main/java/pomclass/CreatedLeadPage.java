package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatedLeadPage {
	public WebDriver driver;
	public CreatedLeadPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement title;
	@FindBy(xpath = "//div[@id='tblLeadInformation']/table/tbody/tr[1]/td[4]")
	private WebElement uNo;
	public WebElement getTitle() {
		return title;
	}
	public WebElement getuNo() {
		return uNo;
	}
	

}
