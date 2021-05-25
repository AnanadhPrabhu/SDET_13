package SDET_13_Vtiger_Test;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import genericUtiltity.BaseClass;
import pomclass.HomePage;
import pomclass.LeadCreatePage;
import pomclass.LeadPage;

public class TC_16_createLeadWithInvalidEmail extends BaseClass {
    @Parameters("browser")
	@Test(groups="smokeTest")
	public void createLeadwithInvalidEmail() throws Throwable {
		String lastName=eUtil.getExcelData("lead", 1, 2);
		String company=eUtil.getExcelData("lead", 1, 3);
		String Email=eUtil.getExcelData("lead", 1, 4);
		String Smail=eUtil.getExcelData("lead", 1, 5);
		home=new HomePage(driver);
		home.clickLead();
		LeadPage lp=new LeadPage(driver);
		lp.clickleadImg();
		LeadCreatePage lcp=new LeadCreatePage(driver);
		boolean value=lcp.creatlead(lastName, company, Email, Smail);
		Assert.assertEquals(value, true);
	}

}
