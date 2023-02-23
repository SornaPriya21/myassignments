package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class TestLogin extends ProjectSpecificMethod{
	@Test
	public void runLogin() {
		LoginPage lp=new LoginPage(driver);
		lp.enterUserName().enterPassword().clickLogin();
		
	}

}
