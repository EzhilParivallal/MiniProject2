package test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.AddContactPage;
import pages.ContactList;
import pages.LoginPage;

public class TC_005_AddContactValidTest extends ProjectSpecificationMethods {
	@BeforeTest
	public void setup() throws IOException {
		readFromPropFile("LoginTestData");	
	}
	@Test
	public void AddContactTest() throws InterruptedException {
		// TODO Auto-generated method stub
		LoginPage obj = new LoginPage(driver);
		obj.Email(prop.getProperty("validemail"))
		.Password(prop.getProperty("validpass"))
		.SubmitButton();
		ContactList obj1 = new ContactList(driver);
		obj1.AddContactClick();
		AddContactPage obj2 = new AddContactPage(driver);
		obj2.FirstName(prop.getProperty("FirstName"))
		.LastName(prop.getProperty("LastName"))
		.DOB(prop.getProperty("DOB"))
		.Email(prop.getProperty("Email"))
		.Phone(prop.getProperty("Phone"))
		.StreetAdrs1(prop.getProperty("StreetAdrs1"))
		.StreetAdrs2(prop.getProperty("StreetAdrs2"))
		.City(prop.getProperty("City"))
		.StateProvince(prop.getProperty("StateProvince"))
		.PostalCode(prop.getProperty("PostalCode"))
		.Country(prop.getProperty("Country"))
		.ButtonSubmit();
		

	}

}
