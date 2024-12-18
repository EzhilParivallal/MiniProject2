package test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.LoginPage;

public class TC_008_LogoutTest extends ProjectSpecificationMethods {
	@BeforeTest
	public void setup() throws IOException {
		readFromPropFile("LoginTestData");	
	}
    @Test
	public void Logout() throws InterruptedException {
		// TODO Auto-generated method stub
		LoginPage obj = new LoginPage(driver);
		obj.Email(prop.getProperty("validemail"))
		.Password(prop.getProperty("validpass"))
		.SubmitButton()
		.LogoutClick()
		.ValidateLogout();

	}

}
