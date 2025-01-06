package test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.HomePage;

public class TC_007_ContactDisplayTest extends ProjectSpecificationMethods{
	@BeforeTest
	public void setup() throws IOException {
		readFromPropFile("LoginTestData");	
		testName="ContactDisplayTest";
		testDescription="Testing Contact Display functionality";
		testAuthor="Ezhil Parivallal";
		testCategory="Smoke Testing";
	}
	@Test
	public void ContactDisplayTest() throws InterruptedException {

		// TODO Auto-generated method stub
		String testCase="positive";
		String errorMessage="";
		HomePage obj = new HomePage(driver);
		obj.Email(prop.getProperty("validemail"))
		.Password(prop.getProperty("validpass"))
		.SubmitButton(testCase,errorMessage)
		.ValidateDisplaySorting();
	}

}
