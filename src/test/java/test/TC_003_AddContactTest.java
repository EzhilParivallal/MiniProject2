package test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.AddContactPage;
import pages.ContactList;
import pages.HomePage;

public class TC_003_AddContactTest extends ProjectSpecificationMethods {
	@BeforeTest
	public void setup() throws IOException {
		readFromPropFile("LoginTestData");	
		sheetName="AddContactTestData";
		testName="AddContactTest";
		testDescription="Testing Add Contact functionality";
		testAuthor="Ezhil Parivallal";
		testCategory="Smoke Testing";
	}
	@Test(dataProvider="excelRead")
	public void AddContactTest(String firstNm,String lastNm,String dob,String email,String phone,String StAdd1,String StAdd2,String city,String stProvince,String post,String country,String testCase,String errorMessage) throws InterruptedException {
		// TODO Auto-generated method stub
		
		HomePage obj = new HomePage(driver);
		obj.Email(prop.getProperty("validemail"))
		.Password(prop.getProperty("validpass"))
		.SubmitButton(testCase,errorMessage);
		ContactList obj1 = new ContactList(driver);
		if(testCase.equals("positive")) {
		obj1.AddContactClick()
		.FirstName(firstNm)
		.LastName(lastNm)
		.DOB(dob)
		.Email(email)
		.Phone(phone)
		.StreetAdrs1(StAdd1)
		.StreetAdrs2(StAdd2)
		.City(city)
		.StateProvince(stProvince)
		.PostalCode(post)
		.Country(country)
		.ButtonSubmit(testCase,errorMessage)
		.ValidateContact(firstNm,lastNm,dob,email,phone,StAdd1,StAdd2,city,stProvince,post,country,testCase,errorMessage);
		}
		else {
			obj1.AddContactClick()
			.FirstName(firstNm)
			.LastName(lastNm)
			.DOB(dob)
			.Email(email)
			.Phone(phone)
			.StreetAdrs1(StAdd1)
			.StreetAdrs2(StAdd2)
			.City(city)
			.StateProvince(stProvince)
			.PostalCode(post)
			.Country(country)
			.ButtonSubmit(testCase, errorMessage);
		}
		

	}

}
