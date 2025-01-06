package test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.ContactDetails;
import pages.ContactList;
import pages.HomePage;

public class TC_006_LogoutTest extends ProjectSpecificationMethods{
	@BeforeTest
	public void setup() throws IOException {
		readFromPropFile("LoginTestData");	
		testName="LogoutTest";
		testDescription="Testing Logout functionality";
		testAuthor="Ezhil Parivallal";
		testCategory="Smoke Testing";
	}
	@Test
	public void EditContactTest() throws InterruptedException {

		// TODO Auto-generated method stub
		String testCase="positive";
		String errorMessage="";
		HomePage obj = new HomePage(driver);
		obj.Email(prop.getProperty("validemail"))
		.Password(prop.getProperty("validpass"))
		.SubmitButton(testCase,errorMessage)
		.LogoutClick()
		.ValidateLogout();
	}
}
