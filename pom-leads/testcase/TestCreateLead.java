package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class TestCreateLead extends ProjectSpecificMethod{
	@BeforeTest
	public void setUp() {
		sheet="createlead";
	}
	
	@Test(dataProvider="fetchData")
	public void runCreateLead(String fname,String lname,String cname) {
		
		LoginPage lp=new LoginPage(driver);
		lp.enterUserName().enterPassword().clickLogin()
		.clickCrmsfa()
		.clickLead()
		.clickCreateLead()
		.enterFirstName(fname).enterLastname(lname).enterCompanyName(cname).clickCreateLeadButton()
		.verifyLead();
	}
	
}
