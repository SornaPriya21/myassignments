package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class TestDuplicateLead extends ProjectSpecificMethod{
	@BeforeTest
	public void setUp() {
		sheet="duplicatelead";
	}
	@Test(dataProvider="fetchData")
	public void runDuplicateLead(String pno) throws InterruptedException {
		LoginPage lp=new LoginPage(driver);
		lp.enterUserName().enterPassword().clickLogin()
		.clickCrmsfa()
		.clickLead()
.clickFindLead().clickPhoneNum().enterPhoneNum(pno).clickFindLead().clickFirstData()
		.clickDuplicate().clickCreateLead();
	}
	
	

}
