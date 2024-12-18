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
	public ContactList ValidateResult(String testcase,String Func) {
		String actual = driver.getTitle();
		//System.out.println(title);
		String expected = "My Contacts";
	if (testcase.equals("positive")) {
		if(Func.equals("SignUp")) {
		  Assert.assertEquals(actual, expected);
		  }
		else if(Func.equals("LogIn")) {
			Assert.assertEquals(actual, expected);
		  }
	}
	else if(testcase.equals("negative")) {
		if(Func.equals("LogIn")) {
			Assert.assertTrue(driver.findElement(By.xpath("//span[text()='Incorrect username or password']")) != null);
		}
		if(Func.equals("SignUp")) {
			Assert.assertTrue(driver.findElement(By.xpath("//span[text()='Email address is already in use']"))!=null);
		}
	}
		return this;
	}
	public ContactList AddContactClick() throws InterruptedException {
		driver.findElement(By.id("add-contact")).click();
		Thread.sleep(3000);
		return this;
	}
	public ContactList DeleteContact(String del_contact) throws InterruptedException {
		WebElement table = driver.findElement(By.id("myTable"));
		//WebElement row = table.findElement(By.xpath("//tr[contains(@class, ‘contactTableBodyRow’)]")); 
		List<WebElement> rows = table.findElements(By.xpath("//tr"));
		List<WebElement> cols = table.findElements(By.xpath("//th"));
		int row_size = rows.size();
		int col_size = cols.size();
		System.out.println(row_size+" "+col_size);
		System.out.println(driver.findElement(By.xpath("//table[@id='myTable']/tbody//tr[1]//td[1]")).getText());
		//td[normalize-space()='Ezhil Parivallal']
		table.findElement(By.xpath("//tr[1]//td[1]")).click();
		driver.findElement(By.id("delete")).click();
		for(int i=1;i<row_size;i++) {
				WebElement cell = table.findElement(By.xpath("//tr["+i+"]//td[1]"));
				String cell_val = cell.getText();
				System.out.println(i+" "+table.findElement(By.xpath("//tr["+i+"]//td[1]")).getText());
				if(cell_val.equals(del_contact)) {
					cell.click();
					Thread.sleep(3000);
					driver.findElement(By.id("delete")).click();
				}
		}
		return this;
	}
	public HomePage LogoutClick() throws InterruptedException {
		driver.findElement(By.id("logout")).click();
		Thread.sleep(3000);
		return new HomePage(driver);
	}
	

}
