package test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.HomePage;
import pages.ContactList;

public class TC_001_SignUpTest extends ProjectSpecificationMethods {
	@BeforeTest
	public void setup() throws IOException {
		sheetName="SignUpTestData";
		testName="SignUpTest";
		testDescription="Testing Sign up functionality";
		testAuthor="Ezhil Parivallal";
		testCategory="Smoke Testing";
	}
    @Test(dataProvider = "excelRead")
	public void SignUpTest(String firstName,String lastName,String email,String password,String testCase,String errorMessage) throws InterruptedException{
		// TODO Auto-generated method stub
		
		HomePage obj = new HomePage(driver);
		if(testCase.equals("positive")) {
		obj.signUpClick()
		.FirstName(firstName)
		.LastName(lastName)
		.Email(email)
		.Password(password)
		.SubmitButton(testCase,errorMessage)
		.ValidateSignUp(testCase,errorMessage);
		}
		else {
			obj.signUpClick()
			.FirstName(firstName)
			.LastName(lastName)
			.Email(email)
			.Password(password)
			.SubmitButton(testCase,errorMessage);
		}
	}

}
