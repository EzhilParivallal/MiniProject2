package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.ProjectSpecificationMethods;

public class LoginPage extends ProjectSpecificationMethods {

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	public LoginPage Email(String mailID) {
		driver.findElement(By.id("email")).sendKeys(mailID);
		return this;
	}
	public LoginPage Password(String pass) {
		driver.findElement(By.id("password")).sendKeys(pass);
		return this;
	}
	public ContactList SubmitButton() throws InterruptedException {
		driver.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		return new ContactList(driver);
	}
}
