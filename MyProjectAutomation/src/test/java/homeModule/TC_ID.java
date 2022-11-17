package homeModule;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import genericLibrery.BaseClass;
import genericLibrery.JavascriptExecutorUtility;
import genericLibrery.PropertyFileUtility;
@Test
public class TC_ID extends BaseClass{
	public void TestCaseDescription() throws IOException {
		WebElement email = driver.findElement(By.id("Email"));
		WebElement password = driver.findElement(By.id("Password"));
		WebElement login = driver.findElement(By.xpath("//input[@value='Log in']"));
		JavascriptExecutorUtility.EnteringDataToElementsUsingJavaScript(email, "ashwininaik@gmail.com");
		JavascriptExecutorUtility.EnteringDataToElementsUsingJavaScript(password, "ashwini");
		JavascriptExecutorUtility.clickingOnElementUsingJavaScript(login);
	 
		//onther normal method
		/*String username = PropertyFileUtility.PropertyReader("Username");
		email.sendKeys(username);
		String password1 = PropertyFileUtility.PropertyReader("Password");
		login.click();*/
		//testcase failed screenshot
		//Assert.assertEquals(false, true);
	}
}
