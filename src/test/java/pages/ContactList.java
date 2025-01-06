package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import base.ProjectSpecificationMethods;

public class ContactList extends ProjectSpecificationMethods {
	public ContactList(WebDriver driver) {
		this.driver = driver;
	}
	public ContactList ValidateSignUp(String testcase,String errorMessage) {
		String actual = driver.getTitle();
		//System.out.println(title);
		String expected = errorMessage;
		Assert.assertEquals(actual, expected);
		return this;
	}
	public ContactList ValidateLogIn(String testCase,String errorMessage) {
		String actual = driver.getTitle();
		//System.out.println(title);
		String expected = errorMessage;
		Assert.assertEquals(actual, expected);
		return this;
	}
	
	public AddContactPage AddContactClick() throws InterruptedException {
		driver.findElement(By.id("add-contact")).click();
		Thread.sleep(3000);
		return new AddContactPage(driver);
	}
	public ContactList ValidateContact(String firstNm,String lastNm,String dob,String email,String phone,String StAdd1,String StAdd2,String city,String stProvince,String post,String country,String testCase,String errorMessage) throws InterruptedException {
		WebElement table = driver.findElement(By.id("myTable"));
		List<WebElement> rows = table.findElements(By.xpath("//tr"));
		List<WebElement> cols = table.findElements(By.xpath("//th"));
		int row_size = rows.size();
		int col_size = cols.size();
		String contact=firstNm+" "+lastNm;
		String cityProvincePost = null,Address = null;
		
		//Expected values
		if((StAdd1.isBlank()==false)&&(StAdd2.isBlank()==false)){
		    Address=StAdd1+" "+StAdd2;}
		else if((StAdd1.isBlank()==false)&&(StAdd2.isBlank()==true)) {
			Address=StAdd1;
		}
		else if((StAdd1.isBlank()==true)&&(StAdd2.isBlank()==false)) {
			Address=StAdd2;
		}
		//-----------------------
		if (city.isBlank()==false) {
			cityProvincePost=city;
		}
		if(stProvince.isBlank()==false) {
			if (cityProvincePost==null) {
				cityProvincePost=stProvince;
			}
			else {
				cityProvincePost=cityProvincePost+" "+stProvince;
			}
		}
		if(post.isBlank()==false) {
			if (cityProvincePost==null) {
				cityProvincePost=post;
			}
			else {
				cityProvincePost=cityProvincePost+" "+post;
			}
		}
		//getting actual values
		String actFirstNm = null,actLastNm = null,actDOB = null,actEmail = null,actPhone = null,actStAdd = null,actCityProvincePost = null,actCountry = null;
		//Thread.sleep(10000);
		for(int i=1;i<row_size;i++) {
				WebElement cell = table.findElement(By.xpath("//tr["+i+"]//td[2]"));
				String cell_val = cell.getText();
				if(cell_val.equals(contact)) {
					//cell.click();
					actFirstNm=firstNm;
					actLastNm=lastNm;
					actDOB=table.findElement(By.xpath("//tr["+i+"]//td[3]")).getText();
					actEmail=table.findElement(By.xpath("//tr["+i+"]//td[4]")).getText();
					actPhone=table.findElement(By.xpath("//tr["+i+"]//td[5]")).getText();
					actStAdd=table.findElement(By.xpath("//tr["+i+"]//td[6]")).getText();
					actCityProvincePost=table.findElement(By.xpath("//tr["+i+"]//td[7]")).getText();
					actCountry=table.findElement(By.xpath("//tr["+i+"]//td[8]")).getText();
					Thread.sleep(5000);
					//driver.findElement(By.id("delete")).click();
				}
		}
		//validation of results
		if(testCase.equals("positive")) {
	    	Assert.assertEquals(actFirstNm,firstNm);
	    	Assert.assertEquals(actLastNm,lastNm);
	    	if(dob.isBlank()==false) {
	    	Assert.assertEquals(actDOB,dob);
	    	}
	    	if(email.isBlank()==false) {
	    	Assert.assertEquals(actEmail,email.toLowerCase());
	    	}    	
	    	if(phone.isBlank()==false) {
	    	Assert.assertEquals(actPhone,phone);
	    	}
	    	if((StAdd1.isBlank()==false)||(StAdd2.isBlank()==false)) {
	    	Assert.assertEquals(actStAdd,Address);
	    	}
	    	if((city.isBlank()==false)||(stProvince.isBlank()==false)||(post.isBlank()==false)) {
	    	Assert.assertEquals(actCityProvincePost,cityProvincePost);
	    	}
	    	if(country.isBlank()==false) {
	    	Assert.assertEquals(actCountry,country);
	    	}
		}
	
return this;
	}
	
	public ContactDetails SelectContact(String firstNm,String lastNm,String testCase,String errorMessage) throws InterruptedException {
		WebElement table = driver.findElement(By.id("myTable"));
		List<WebElement> rows = table.findElements(By.xpath("//tr"));
		List<WebElement> cols = table.findElements(By.xpath("//th"));
		int row_size = rows.size();
		int col_size = cols.size();
		String contact=firstNm+" "+lastNm;
		//Thread.sleep(10000);
		for(int i=1;i<row_size;i++) {
				WebElement cell = table.findElement(By.xpath("//tr["+i+"]//td[2]"));
				String cell_val = cell.getText();
				if(cell_val.equals(contact)) {
					cell.click();
					break;
					//driver.findElement(By.id("delete")).click();
				}
		}
		return new ContactDetails(driver);
	}

	public HomePage LogoutClick() throws InterruptedException {
		driver.findElement(By.id("logout")).click();
		Thread.sleep(3000);
		return new HomePage(driver);
	}
	public void ValidateDisplaySorting() {
		// TODO Auto-generated method stub
		WebElement table = driver.findElement(By.id("myTable"));
		List<WebElement> rows = table.findElements(By.xpath("//tr"));
		List<WebElement> cols = table.findElements(By.xpath("//th"));
		int row_size = rows.size();
		int col_size = cols.size();
		String [] lastName = new String[row_size-1];
		//Thread.sleep(10000);
		for(int i=1;i<row_size;i++) {
				WebElement cell = table.findElement(By.xpath("//tr["+i+"]//td[2]"));
				String cell_val = cell.getText();
				String[] last=cell_val.split(" ");
				lastName[i-1]=last[1];
				//System.out.println(lastName[i-1]);
		}
		Boolean sorting = true;
		for (int i = 1; i < lastName.length; i++) {
            if (lastName[i - 1].compareTo(lastName[i]) > 0) {
              sorting = false;
            }
        }
		Assert.assertTrue(sorting.booleanValue()==true);
	}
	

}
