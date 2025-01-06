package test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.AddContactPage;
import pages.ContactList;
import pages.HomePage;

public class TC_005_DeleteContactTest extends ProjectSpecificationMethods {
	@BeforeTest
	public void setup() throws IOException {
		readFromPropFile("LoginTestData");	
		sheetName="DeleteContactTestData";
		testName="DeleteContactTest";
		testDescription="Testing Delete Contact functionality";
		testAuthor="Ezhil Parivallal";
		testCategory="Smoke Testing";
	}
	@Test(dataProvider="excelRead")
	public void DeleteContactTest(String firstNm,String lastNm,String testCase,String errorMessage) throws InterruptedException{
		// TODO Auto-generated method stub
		HomePage obj = new HomePage(driver);
		obj.Email(prop.getProperty("validemail"))
		.Password(prop.getProperty("validpass"))
		.SubmitButton(testCase, errorMessage);
		ContactList obj1 = new ContactList(driver);
		obj1.SelectContact(firstNm, lastNm, testCase, errorMessage)
		.delContact();

	}

}
