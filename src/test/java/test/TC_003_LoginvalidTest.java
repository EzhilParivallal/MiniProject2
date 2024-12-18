package test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.HomePage;
import pages.LoginPage;
import pages.ContactList;

public class TC_003_LoginvalidTest extends ProjectSpecificationMethods {
	
	@BeforeTest
	public void setup() throws IOException {
		readFromPropFile("LoginTestData");
		testName="LogInTest";
		testDescription="Testing Log in functionality with positive case";
		testAuthor="Ezhil Parivallal";
		testCategory="Smoke Testing";
	}
    @Test
	public void LoginValid() throws InterruptedException {
		// TODO Auto-generated method stub
		LoginPage obj = new LoginPage(driver);
		obj.Email(prop.getProperty("validemail"))
		.Password(prop.getProperty("validpass"))
		.SubmitButton()
		.ValidateResult("positive","LogIn");
	}

}
