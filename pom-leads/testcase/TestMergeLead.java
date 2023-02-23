package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class TestMergeLead extends ProjectSpecificMethod {
	@BeforeTest
	public void setUp() {
		sheet="mergelead";
	}
	@Test(dataProvider="fetchData")
	public void runMergeLead(String name,String name1) throws InterruptedException {
		LoginPage lp=new LoginPage(driver);
		lp.enterUserName().enterPassword().clickLogin()
		.clickCrmsfa()
		.clickLead()
		.clickMergeLead()
		.clickFromLead(name).clickToLead(name1).clickMerge()
		.clickFindLead()
		.enterId();
		
	}
}


