package genericLibrery;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavascriptExecutorUtility extends BaseClass{
	public static JavascriptExecutor js=(JavascriptExecutor) driver;
	public static void clickingOnElementUsingJavaScript(WebElement element) {
		js.executeScript("arguments[0].click();",element);
	}
	public static void EnteringDataToElementsUsingJavaScript(WebElement element,String data) {
		js.executeScript("arguments[0].value='"+data+"';", element);
	}
}
