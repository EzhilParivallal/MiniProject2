package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import base.ProjectSpecificationMethods;

public class HomePage extends ProjectSpecificationMethods {
	public HomePage(WebDriver driver) {
		this.driver=driver;
		//PageFactory.initElements(driver, this);
	}
	public SignUpPage signUpClick() {
		driver.findElement(By.xpath("//button[text()='Sign up']")).click();
		return new SignUpPage(driver);
	}
	public void ValidateLogout() {
		String title = driver.getTitle();
		Assert.assertTrue(title.equals("Contact List App"));
	}
	public HomePage Email(String mailID) {
		if(mailID.isBlank()) {}
		else {
		driver.findElement(By.id("email")).sendKeys(mailID);}
		return this;
	}
	public HomePage Password(String pass) {
		if(pass.isBlank()) {}
		else {
		driver.findElement(By.id("password")).sendKeys(pass);}
		return this;
	}
	public ContactList SubmitButton(String testCase, String errorMessage) throws InterruptedException {
		driver.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		if(testCase.equals("negative_login")) {
			String actError=driver.findElement(By.id("error")).getText();
			Assert.assertEquals(actError,errorMessage);
		}
		return new ContactList(driver);
	}


}
