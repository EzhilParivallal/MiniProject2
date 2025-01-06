package test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.HomePage;
import pages.ContactList;

public class TC_002_LoginTest extends ProjectSpecificationMethods {
	
	@BeforeTest
	public void setup() throws IOException {
		sheetName="LoginTestData";
		testName="LogInTest";
		testDescription="Testing Log in functionality";
		testAuthor="Ezhil Parivallal";
		testCategory="Smoke Testing";
	}
    @Test(dataProvider="excelRead")
	public void LoginValid(String email,String password,String testCase, String errorMessage) throws InterruptedException {
		// TODO Auto-generated method stub
		HomePage obj = new HomePage(driver);
		if(testCase.equals("positive")) {
		obj.Email(email)
		.Password(password)
		.SubmitButton(testCase,errorMessage)
		.ValidateLogIn(testCase,errorMessage);
		}
		else {
			obj.Email(email)
			.Password(password)
			.SubmitButton(testCase,errorMessage);
		}
	}

}
