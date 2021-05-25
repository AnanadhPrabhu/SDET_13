package SDET_13_Vtiger_Test;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import genericUtiltity.BaseClass;
import pomclass.CreatedLeadPage;
import pomclass.HomePage;
import pomclass.LeadCreatePage;
import pomclass.LeadPage;

public class TC_17_createLeadWithValidMobNO extends BaseClass{
	@Parameters("browser")
	@Test(groups="regressionTest")
	public void createLeadWithValidMoNo() throws Throwable {
	String name=eUtil.getExcelData("lead", 4, 2)+jUtil.getRandomData();
	String cName=eUtil.getExcelData("lead", 4, 3);
	String mobNo=eUtil.getExcelData("lead",4, 4);
	String pNo=eUtil.getExcelData("lead", 4, 5);
	
	home=new HomePage(driver);
	LeadPage lp= home.clickLead();
	LeadCreatePage lcp=lp.clickleadImg();
	CreatedLeadPage clp= lcp.createLeadWithMobNo(name, cName, mobNo, pNo);
	String titleInfo=clp.getTitle().getText();
	String leadUn=clp.getuNo().getText();
	
	
	Assert.assertTrue(titleInfo.contains(leadUn));
	Assert.assertTrue(titleInfo.contains(name));
	
	
	}

}
