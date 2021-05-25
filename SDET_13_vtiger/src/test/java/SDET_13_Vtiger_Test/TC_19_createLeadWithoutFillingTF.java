package SDET_13_Vtiger_Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtiltity.BaseClass;
import pomclass.HomePage;
import pomclass.LeadCreatePage;
import pomclass.LeadPage;

public class TC_19_createLeadWithoutFillingTF extends BaseClass {
	@Test(groups="smoke")
	public void createLeadWithoutFillingTF() {
		home=new HomePage(driver);
		LeadPage lp=home.clickLead();
		LeadCreatePage lcp=lp.clickleadImg();
		Assert.assertTrue(true==lcp.withoutFillingTF(), "lead page is not generated");
		System.out.println("lead page not created");
	}

}
