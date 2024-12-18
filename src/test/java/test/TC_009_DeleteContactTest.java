package test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.AddContactPage;
import pages.ContactList;
import pages.LoginPage;

public class TC_009_DeleteContactTest extends ProjectSpecificationMethods {
	@BeforeTest
	public void setup() throws IOException {
		readFromPropFile("LoginTestData");	
	}
	@Test
	public void AddContactOptional() throws InterruptedException{
		// TODO Auto-generated method stub
		LoginPage obj = new LoginPage(driver);
		obj.Email(prop.getProperty("validemail"))
		.Password(prop.getProperty("validpass"))
		.SubmitButton();
		ContactList obj1 = new ContactList(driver);
		obj1.DeleteContact(prop.getProperty("delContact"));
		

	}

}
