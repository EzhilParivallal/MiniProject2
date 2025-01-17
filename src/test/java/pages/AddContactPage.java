package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import base.ProjectSpecificationMethods;

public class AddContactPage extends ProjectSpecificationMethods {
	public AddContactPage(WebDriver driver) {
		this.driver = driver;
	}
	public AddContactPage FirstName(String firstNm) {
		if(firstNm.isBlank()) {}
		else {
		driver.findElement(By.id("firstName")).sendKeys(firstNm);}
		return this;
	}
	public AddContactPage LastName(String lastNm) {
		if(lastNm.isBlank()) {}
		else {
		driver.findElement(By.id("lastName")).sendKeys(lastNm);}
		return this;
	}
	public AddContactPage DOB(String dob) {
		if(dob.isBlank()) {}
		else {
		driver.findElement(By.id("birthdate")).sendKeys(dob);}
		return this;
	}
	public AddContactPage Email(String email) {
		if(email.isBlank()) {}
		else {
		driver.findElement(By.id("email")).sendKeys(email);}
		return this;
	}
	public AddContactPage Phone(String phone) {
		if(phone.isBlank()) {}
		else {
		driver.findElement(By.id("phone")).sendKeys(phone);}
		return this;
	}
	public AddContactPage StreetAdrs1(String Add1) {
		if(Add1.isBlank()) {}
		else {
		driver.findElement(By.id("street1")).sendKeys(Add1);}
		return this;
	}
	public AddContactPage StreetAdrs2(String Add2) {
		if(Add2.isBlank()) {}
		else {
		driver.findElement(By.id("street2")).sendKeys(Add2);}
		return this;
	}
	public AddContactPage City(String city) {
		if(city.isBlank()) {}
		else {
		driver.findElement(By.id("city")).sendKeys(city);}
		return this;
	}
	public AddContactPage StateProvince(String state) {
		if(state.isBlank()) {}
		else {
		driver.findElement(By.id("stateProvince")).sendKeys(state);}
		return this;
	}
	public AddContactPage PostalCode(String post) {
		if(post.isBlank()) {}
		else {
		driver.findElement(By.id("postalCode")).sendKeys(post);}
		return this;
	}
	public AddContactPage Country(String country) {
		if(country.isBlank()) {}
		else {
		driver.findElement(By.id("country")).sendKeys(country);}
		return this;
	}
	public ContactList ButtonSubmit(String testCase,String errorMessage) throws InterruptedException {
		driver.findElement(By.id("submit")).click();
		Thread.sleep(5000);
		if(testCase.equals("negative")) {
			String actError=driver.findElement(By.id("error")).getText();
			Assert.assertEquals(actError,errorMessage);
		}
		return new ContactList(driver);
	}
}
