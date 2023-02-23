package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class TestEditLead extends ProjectSpecificMethod{
	@BeforeTest
	public void setUp() {
		sheet="editlead";
	}
	@Test(dataProvider="fetchData")
	public void runEditLead(String pno,String cmpname) throws InterruptedException {
		LoginPage lp=new LoginPage(driver);
		lp.enterUserName().enterPassword().clickLogin()
		.clickCrmsfa()
		.clickLead()
		.clickFindLead()
		.clickPhoneNum().enterPhoneNum(pno).clickFindLead().clickFirstData()
		.clickEdit()
		.updateCompanyName(cmpname).clickUpdate();
		
	}

}
