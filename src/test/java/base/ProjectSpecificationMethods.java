package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import utils.UtilityClass;

public class ProjectSpecificationMethods extends UtilityClass {
	@BeforeSuite
	public void reportInitialization() {
		String path = "C:\\Users\\ezhil\\eclipse-workspace\\JAT_Project_2\\reports\\JATProject2Report.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("MiniProject_2 Report");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
	}
	@BeforeClass
	public void testDetails() {
		test=extent.createTest(testName,testDescription);
		test.assignCategory(testCategory);
		test.assignAuthor(testAuthor);
	}
	@Parameters({"url","browser"})
	@BeforeMethod
	public void launchAndLoadURL(String url,String browser) {
		// TODO Auto-generated method stub
		browserLaunch(url,browser);

	}
	@AfterMethod
	public void browserClose() {
	   closeBrowser();	
	}
	@AfterSuite
	public void reportClose() {
		extent.flush();
	}
}