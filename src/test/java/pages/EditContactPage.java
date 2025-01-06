package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import base.ProjectSpecificationMethods;

public class EditContactPage extends ProjectSpecificationMethods {
   
	public EditContactPage(WebDriver driver) {
		this.driver=driver;
	}
	public EditContactPage FirstName(String firstNm) throws InterruptedException {
		WebElement first=driver.findElement(By.id("firstName"));
		if((firstNm.isBlank()==false)&&(firstNm.equals("Blk")==false)) {
			first.sendKeys(Keys.chord(Keys.CONTROL, "a"),"");
			Thread.sleep(2000);
			first.sendKeys(Keys.chord(Keys.CONTROL, "a"),firstNm);
			Thread.sleep(2000);
		}
		else if(firstNm.equals("Blk")==true) {
			first.sendKeys(Keys.chord(Keys.CONTROL, "a"),"");
			Thread.sleep(2000);
		}
		return this;
	}
	public EditContactPage LastName(String lastNm) throws InterruptedException {
		WebElement last=driver.findElement(By.id("lastName"));
		if((lastNm.isBlank()==false)&&(lastNm.equals("Blk")==false)) {
			last.sendKeys(Keys.chord(Keys.CONTROL, "a"),"");
			Thread.sleep(2000);
			last.sendKeys(Keys.chord(Keys.CONTROL, "a"),lastNm);
			Thread.sleep(2000);
		}
		else if(lastNm.equals("Blk")==true) {
			last.sendKeys(Keys.chord(Keys.CONTROL, "a"),"");	
			Thread.sleep(2000);
		}
		return this;
	}
	public EditContactPage DOB(String dob) throws InterruptedException {
		WebElement date=driver.findElement(By.id("birthdate"));
		if((dob.isBlank()==false)&&(dob.equals("Blk")==false)) {
			date.sendKeys(Keys.chord(Keys.CONTROL, "a"),"");
			Thread.sleep(2000);
			date.sendKeys(Keys.chord(Keys.CONTROL, "a"),dob);
			Thread.sleep(2000);
		}
		else if(dob.equals("Blk")==true) {
			date.sendKeys(Keys.chord(Keys.CONTROL, "a")," ");	
			date.clear();
			Thread.sleep(2000);
		}
		return this;
	}
	public EditContactPage Email(String email) throws InterruptedException {
		WebElement emailID=driver.findElement(By.id("email"));
		if((email.isBlank()==false)&&(email.equals("Blk")==false)) {
			emailID.sendKeys(Keys.chord(Keys.CONTROL, "a"),"");
			Thread.sleep(2000);
			emailID.sendKeys(Keys.chord(Keys.CONTROL, "a"),email);
			Thread.sleep(2000);
		}
		else if(email.equals("Blk")==true) {
			emailID.sendKeys(Keys.chord(Keys.CONTROL, "a")," ");
			emailID.clear();
			Thread.sleep(2000);
		}
		return this;
	}
	public EditContactPage Phone(String phone) throws InterruptedException {
		WebElement phoneNo=driver.findElement(By.id("phone"));
		if((phone.isBlank()==false)&&(phone.equals("Blk")==false)) {
			phoneNo.sendKeys(Keys.chord(Keys.CONTROL, "a"),"");
			Thread.sleep(2000);
			phoneNo.sendKeys(Keys.chord(Keys.CONTROL, "a"),phone);
			Thread.sleep(2000);
		}
		else if(phone.equals("Blk")==true) {
			phoneNo.sendKeys(Keys.chord(Keys.CONTROL, "a")," ");
			phoneNo.clear();
			Thread.sleep(2000);
		}
		return this;
	}
	public EditContactPage StreetAdrs1(String Add1) throws InterruptedException {
		WebElement address1=driver.findElement(By.id("street1"));
		if((Add1.isBlank()==false)&&(Add1.equals("Blk")==false)) {
			address1.sendKeys(Keys.chord(Keys.CONTROL, "a"),"");
			Thread.sleep(2000);
			address1.sendKeys(Keys.chord(Keys.CONTROL, "a"),Add1);
			Thread.sleep(2000);
		}
		else if(Add1.equals("Blk")==true) {
			address1.sendKeys(Keys.chord(Keys.CONTROL, "a")," ");
			address1.clear();
			Thread.sleep(2000);
		}
		return this;
	}
	public EditContactPage StreetAdrs2(String Add2) throws InterruptedException {
		WebElement address2=driver.findElement(By.id("street2"));
		if((Add2.isBlank()==false)&&(Add2.equals("Blk")==false)) {
			address2.sendKeys(Keys.chord(Keys.CONTROL, "a"),"");
			Thread.sleep(2000);
			address2.sendKeys(Keys.chord(Keys.CONTROL, "a"),Add2);
			Thread.sleep(2000);
		}
		else if(Add2.equals("Blk")==true) {
			address2.sendKeys(Keys.chord(Keys.CONTROL, "a")," ");
			address2.clear();
			Thread.sleep(2000);
		}
		return this;
	}
	public EditContactPage City(String city) throws InterruptedException {
		WebElement cityNm=driver.findElement(By.id("city"));
		if((city.isBlank()==false)&&(city.equals("Blk")==false)) {
			cityNm.sendKeys(Keys.chord(Keys.CONTROL, "a"),"");
			Thread.sleep(2000);
			cityNm.sendKeys(Keys.chord(Keys.CONTROL, "a"),city);
			Thread.sleep(2000);
		}
		else if(city.equals("Blk")==true) {
			cityNm.sendKeys(Keys.chord(Keys.CONTROL, "a")," ");	
			cityNm.clear();
			Thread.sleep(2000);
		}
		return this;
	}
	public EditContactPage StateProvince(String state) throws InterruptedException {
		WebElement stPro=driver.findElement(By.id("stateProvince"));
		if((state.isBlank()==false)&&(state.equals("Blk")==false)) {
			stPro.sendKeys(Keys.chord(Keys.CONTROL, "a"),"");
			Thread.sleep(2000);
			stPro.sendKeys(Keys.chord(Keys.CONTROL, "a"),state);
			Thread.sleep(2000);
		}
		else if(state.equals("Blk")==true) {
			stPro.sendKeys(Keys.chord(Keys.CONTROL, "a")," ");	
			stPro.clear();
			Thread.sleep(2000);
		}
		return this;
	}
	public EditContactPage PostalCode(String post) throws InterruptedException {
		WebElement postCD=driver.findElement(By.id("postalCode"));
		if((post.isBlank()==false)&&(post.equals("Blk")==false)) {
			postCD.sendKeys(Keys.chord(Keys.CONTROL, "a"),"");
			Thread.sleep(2000);
			postCD.sendKeys(Keys.chord(Keys.CONTROL, "a"),post);
			Thread.sleep(2000);
		}
		else if(post.equals("Blk")==true) {
			postCD.sendKeys(Keys.chord(Keys.CONTROL, "a")," ");	
			postCD.clear();
			Thread.sleep(2000);
		}
		return this;
	}
	public EditContactPage Country(String country) throws InterruptedException {
		WebElement cntry=driver.findElement(By.id("country"));
		if((country.isBlank()==false)&&(country.equals("Blk")==false)) {
			cntry.sendKeys(Keys.chord(Keys.CONTROL, "a"),"");
			Thread.sleep(2000);
			cntry.sendKeys(Keys.chord(Keys.CONTROL, "a"),country);
			Thread.sleep(2000);
		}
		else if(country.equals("Blk")==true) {
			cntry.sendKeys(Keys.chord(Keys.CONTROL, "a")," ");
			cntry.clear();
			Thread.sleep(2000);
		}
		return this;
	}
	public ContactDetails ButtonSubmit(String testCase,String errorMessage) throws InterruptedException {
		driver.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		if(testCase.equals("negative")) {
			String actError=driver.findElement(By.id("error")).getText();
			Assert.assertEquals(actError,errorMessage);
		}
		return new ContactDetails(driver);
	}

	

}
