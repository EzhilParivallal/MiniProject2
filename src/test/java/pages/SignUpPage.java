package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import base.ProjectSpecificationMethods;

public class SignUpPage extends ProjectSpecificationMethods {
	
	public SignUpPage(WebDriver driver) {
		this.driver = driver;
	}
	public SignUpPage FirstName(String firstNm) {
		if(firstNm.isBlank()) {}
		else {
		driver.findElement(By.id("firstName")).sendKeys(firstNm);
		}
		return this;
	}
	public SignUpPage LastName(String lastNm) {
		if(lastNm.isBlank()) {}
		else {
		driver.findElement(By.id("lastName")).sendKeys(lastNm);
		}
		return this;
	}
	public SignUpPage Email(String email) {
		if(email.isBlank()) {}
		else {
		driver.findElement(By.id("email")).sendKeys(email);
		}
		return this;
	}
	public SignUpPage Password(String pass) {
		if(pass.isBlank()) {}
		else {
		driver.findElement(By.id("password")).sendKeys(pass);
		}
		return this;
	}
	public ContactList SubmitButton(String testCase,String errorMessage) throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(3000);
		
		if (testCase.equals("negative")) {
			String actError=driver.findElement(By.id("error")).getText();
			//System.out.println(actError+" "+errorMessage);
			Assert.assertEquals(errorMessage,actError);
		}
		return new ContactList(driver);
	}
}
