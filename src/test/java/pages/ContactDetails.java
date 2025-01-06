package pages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import base.ProjectSpecificationMethods;

public class ContactDetails extends ProjectSpecificationMethods {
    
	public ContactDetails(WebDriver driver) {
		this.driver=driver;
	}
    public ContactList delContact() throws InterruptedException {
    	driver.findElement(By.id("delete")).click();
    	Thread.sleep(3000);
    	Alert alert = driver.switchTo().alert();
    	alert.accept();
    	return new ContactList(driver);
    }
    public EditContactPage editContact() throws InterruptedException {
    	//Thread.sleep(6000);
    	driver.findElement(By.xpath("//button[@id='edit-contact']")).click();
    	return new EditContactPage(driver);
    }
    
    public String[] FetchContact() throws InterruptedException {
    	 Thread.sleep(8000);
    	 String[] actualVal = new String[11];
    	 actualVal[0]=driver.findElement(By.xpath("//span[@id='firstName']")).getText();
    	 actualVal[1]=driver.findElement(By.xpath("//span[@id='lastName']")).getText();
    	 actualVal[2]=driver.findElement(By.xpath("//span[@id='birthdate']")).getText();
    	 actualVal[3]=driver.findElement(By.xpath("//span[@id='email']")).getText();
    	 actualVal[4]=driver.findElement(By.xpath("//span[@id='phone']")).getText();
    	 actualVal[5]=driver.findElement(By.xpath("//span[@id='street1']")).getText();
    	 actualVal[6]=driver.findElement(By.xpath("//span[@id='street2']")).getText();
    	 actualVal[7]=driver.findElement(By.xpath("//span[@id='city']")).getText();
    	 actualVal[8]=driver.findElement(By.xpath("//span[@id='stateProvince']")).getText();
    	 actualVal[9]=driver.findElement(By.xpath("//span[@id='postalCode']")).getText();
    	 actualVal[10]=driver.findElement(By.xpath("//span[@id='country']")).getText();
    	
    	 return actualVal;
    }
    public void ValidateEditContact(String firstNm,String lastNm,String dob,String email,String phone,String StAdd1,String StAdd2,String city,String stProvince,String post,String country,String testCase,String errorMessage,String[] actualVal) throws InterruptedException {
		String cityProvincePost = null,Address = null;
		Thread.sleep(6000);
		String actDOB=null,actEmail=null,actPhone=null,actStAdd1=null,actStAdd2=null,actCity=null,actStProvince=null,actPost=null,actCountry=null;
		String expDOB=null,expEmail=null,expPhone=null,expStAdd1=null,expStAdd2=null,expCity=null,expStProvince=null,expPost=null,expCountry=null;
		//Actual values
		String actFirstNm=driver.findElement(By.xpath("//span[@id='firstName']")).getText();
    	String actLastNm=driver.findElement(By.xpath("//span[@id='lastName']")).getText();
			actDOB=driver.findElement(By.xpath("//span[@id='birthdate']")).getText();	
			actEmail=driver.findElement(By.xpath("//span[@id='email']")).getText();
			actPhone=driver.findElement(By.xpath("//span[@id='phone']")).getText();
			actStAdd1=driver.findElement(By.xpath("//span[@id='street1']")).getText();
			actStAdd2=driver.findElement(By.xpath("//span[@id='street2']")).getText();
			actCity=driver.findElement(By.xpath("//span[@id='city']")).getText();
			actStProvince=driver.findElement(By.xpath("//span[@id='stateProvince']")).getText();
			actPost=driver.findElement(By.xpath("//span[@id='postalCode']")).getText();
			actCountry=driver.findElement(By.xpath("//span[@id='country']")).getText();
	   
		//Expected values	
		String expFirstName=firstNm;
		String expLastName=lastNm;

	    if(dob.equals("Blk")==true) { expDOB=""; }
	    else if(dob.isBlank()==false) {	expDOB=dob;}
	    else {expDOB=actualVal[2];}
	    
	    if(email.equals("Blk")) {expEmail="";}
	    else if(email.isBlank()==false) {expEmail=email.toLowerCase();}
	    else{expEmail=actualVal[3];}
	    
	    if(phone.equals("Blk")) {expPhone="";}
	    else if(phone.isBlank()==false) {expPhone=phone;}
	    else{expPhone=actualVal[4];}
	    
	    if(StAdd1.equals("Blk")) {expStAdd1="";}
	    else if(StAdd1.isBlank()==false) {expStAdd1=StAdd1;}
	    else{expStAdd1=actualVal[5];}
	    
	    if(StAdd2.equals("Blk")) {expStAdd2="";}
	    else if(StAdd2.isBlank()==false) {expStAdd2=StAdd2;}
	    else{expStAdd2=actualVal[6];}
	    
	    if(city.equals("Blk")) {expCity="";}
	    else if(city.isBlank()==false) {expCity=city;}
	    else{expCity=actualVal[7];}
	    
	    if(stProvince.equals("Blk")) {expStProvince="";}
	    else if(stProvince.isBlank()==false) {expStProvince=stProvince;}
	    else{expStProvince=actualVal[8];}
	    
	    if(post.equals("Blk")) {expPost="";}
	    else if(post.isBlank()==false) {expPost=post;}
	    else {expPost=actualVal[9];}
	    
	    if(country.equals("Blk")) {expCountry="";}
	    else if(country.isBlank()==false) {expCountry=country;}
	    else{expCountry=actualVal[10];}
	    
	    Assert.assertEquals(actFirstNm,expFirstName);
    	Assert.assertEquals(actLastNm,expLastName);
    	Assert.assertEquals(actDOB, expDOB);
    	Assert.assertEquals(actEmail, expEmail);
    	Assert.assertEquals(actPhone, expPhone);
    	Assert.assertEquals(actStAdd1, expStAdd1);
    	Assert.assertEquals(actStAdd2, expStAdd2);
    	Assert.assertEquals(actCity, expCity);
    	Assert.assertEquals(actStProvince, expStProvince);
    	Assert.assertEquals(actPost, expPost);
    	Assert.assertEquals(actCountry, expCountry);
	    	
    }
}
