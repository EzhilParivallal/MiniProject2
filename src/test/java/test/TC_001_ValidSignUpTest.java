package test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.HomePage;
import pages.ContactList;

public class TC_001_ValidSignUpTest extends ProjectSpecificationMethods {
	@BeforeTest
	public void setup() throws IOException {
		readFromPropFile("LoginTestData");
		testName="SignUpTest";
		testDescription="Testing Sign up functionality with positive case";
		testAuthor="Ezhil Parivallal";
		testCategory="Smoke Testing";
	}
    @Test
	public void ValidSignUpTest() throws InterruptedException{
		// TODO Auto-generated method stub
		
		HomePage obj = new HomePage(driver);
		obj.signUpClick()
		.FirstName(prop.getProperty("FirstNm"))
		.LastName(prop.getProperty("LastNm"))
		.Email(prop.getProperty("Email"))
		.Password(prop.getProperty("Pass"))
		.SubmitButton()
		.ValidateResult("positive","SignUp");
	}

}
