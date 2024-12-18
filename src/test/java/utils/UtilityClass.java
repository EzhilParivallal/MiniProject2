package utils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class UtilityClass {
	public static WebDriver driver;
	public static Properties prop;
	public static ExtentReports extent;
	public static ExtentTest test;
	public String testName, testDescription, testCategory,testAuthor;
	
	 public void browserLaunch(String url,String browser) {
		 if (browser.equals("Chrome")) {
		 driver = new ChromeDriver();
		 }
		 driver.get(url);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 }
	 public void closeBrowser() {
		 driver.close();
	 }
	 
	 public static void readFromPropFile(String FileName) throws IOException {
		 FileReader file = new FileReader("C:\\Users\\ezhil\\eclipse-workspace\\JAT_Project_2\\src\\test\\resources\\testData\\"+FileName+".properties");
		 prop = new Properties();
		 prop.load(file);
	 }
	 public String screenshot(String name) throws IOException {
		 String path="C:\\Users\\ezhil\\eclipse-workspace\\JAT_Project_2\\snap\\"+name+".png";
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File dest = new File(path);
		 FileUtils.copyFile(src, dest);
		 return path;
	 }
}
