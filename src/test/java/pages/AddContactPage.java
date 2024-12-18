package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.ProjectSpecificationMethods;

public class AddContactPage extends ProjectSpecificationMethods {
	public AddContactPage(WebDriver driver) {
		this.driver = driver;
	}
	public AddContactPage FirstName(String firstNm) {
		driver.findElement(By.id("firstName")).sendKeys(firstNm);
		return this;
	}
	public AddContactPage LastName(String lastNm) {
		driver.findElement(By.id("lastName")).sendKeys(lastNm);
		return this;
	}
	public AddContactPage DOB(String dob) {
		driver.findElement(By.id("birthdate")).sendKeys(dob);
		return this;
	}
	public AddContactPage Email(String email) {
		driver.findElement(By.id("email")).sendKeys(email);
		return this;
	}
	public AddContactPage Phone(String phone) {
		driver.findElement(By.id("phone")).sendKeys(phone);
		return this;
	}
	public AddContactPage StreetAdrs1(String Add1) {
		driver.findElement(By.id("street1")).sendKeys(Add1);
		return this;
	}
	public AddContactPage StreetAdrs2(String Add2) {
		driver.findElement(By.id("street2")).sendKeys(Add2);
		return this;
	}
	public AddContactPage City(String city) {
		driver.findElement(By.id("city")).sendKeys(city);
		return this;
	}
	public AddContactPage StateProvince(String state) {
		driver.findElement(By.id("stateProvince")).sendKeys(state);
		return this;
	}
	public AddContactPage PostalCode(String post) {
		driver.findElement(By.id("postalCode")).sendKeys(post);
		return this;
	}
	public AddContactPage Country(String country) {
		driver.findElement(By.id("country")).sendKeys(country);
		return this;
	}
	public ContactList ButtonSubmit() throws InterruptedException {
		driver.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		return new ContactList(driver);
	}
}
