package genericLibrery;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static ExtentSparkReporter reporter;
	public static ExtentReports report;
	public static ExtentTest logger;
		
	
	@BeforeSuite
	public void launchingBrowser() {
		reporter=new ExtentSparkReporter("./reprts/extentreports.html");
		report=new ExtentReports();
		report.attachReporter(reporter);
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	}
	@BeforeClass
	public void navigatingToApp() {
		driver.get("https://demowebshop.tricentis.com/login");
	//	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	}
	@BeforeMethod
	public void start() {
		 logger.log(Status.INFO, "successfully start ");
	}
	@AfterMethod
	public void CheckingFailure(ITestResult result) throws IOException {
		if(result.getStatus()==result.FAILURE) {
			String path = ScreenShotUtility.takeScreenShotMethod(result.getName());
			System.out.println(result.getName());
		    logger.log(Status.INFO, "successfully navigated to application ");
			logger.addScreenCaptureFromPath(path);
		}
	}
	@AfterClass
	public void loggingOut() {
		System.out.println("logged out succes");
	}
	@AfterSuite
	public void treadOut() {
	driver.quit();
	
	}
}
