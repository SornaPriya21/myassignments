package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class TestDeleteLead extends ProjectSpecificMethod{
	@BeforeTest
	public void setUp() {
		sheet="deletelead";
	}
	@Test(dataProvider="fetchData")
public void runDeleteLead(String pno) throws InterruptedException {
		LoginPage lp=new LoginPage(driver);
		lp.enterUserName().enterPassword().clickLogin()
		.clickCrmsfa()
		.clickLead()
		.clickFindLead()
		.clickPhoneNum()
		.enterPhoneNum(pno).clickFindLead().clickFirstData()
		.clickDeleteLead()
		.clickFindLead()
		.enterId();

}
}
