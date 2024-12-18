package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
		if(title.equals("Contact List App")) {
			System.out.println("Logout successful");
		}
		else {
			System.out.println("Logout failed");
		}
	}

}
