package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.ProjectSpecificationMethods;

public class SignUpPage extends ProjectSpecificationMethods {
	
	public SignUpPage(WebDriver driver) {
		this.driver = driver;
	}
	public SignUpPage FirstName(String firstNm) {
		driver.findElement(By.id("firstName")).sendKeys(firstNm);
		return this;
	}
	public SignUpPage LastName(String lastNm) {
		driver.findElement(By.id("lastName")).sendKeys(lastNm);
		return this;
	}
	public SignUpPage Email(String email) {
		driver.findElement(By.id("email")).sendKeys(email);
		return this;
	}
	public SignUpPage Password(String pass) {
		driver.findElement(By.id("password")).sendKeys(pass);
		return this;
	}
	public ContactList SubmitButton() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(3000);
		return new ContactList(driver);
	}
}