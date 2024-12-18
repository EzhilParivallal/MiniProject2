package test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.LoginPage;

public class TC_004_LogininvalidTest extends ProjectSpecificationMethods {
	@BeforeTest
	public void setup() throws IOException {
		readFromPropFile("LoginTestData");	
		testName="LogInTest";
		testDescription="Testing Log in functionality with negative case";
		testAuthor="Ezhil Parivallal";
		testCategory="Smoke Testing";
	}
	@Test
	public void LoginInValid() throws InterruptedException {
		// TODO Auto-generated method stub
		LoginPage obj = new LoginPage(driver);
		obj.Email(prop.getProperty("invalidemail"))
		.Password(prop.getProperty("invalidpass"))
		.SubmitButton()
		.ValidateResult("negative","LogIn");
	}

}
