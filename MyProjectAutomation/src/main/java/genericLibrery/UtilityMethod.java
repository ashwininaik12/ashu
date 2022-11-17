package genericLibrery;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class UtilityMethod {
	public static Actions ActionsUtility(WebDriver driver) {
		Actions act=new Actions(driver);
		return act;
	}
	public void SelectUtility(WebElement element,String value) {
		Select sele=new Select(element);
		try {
			sele.selectByVisibleText(value);
		}
		catch (NoSuchMethodError e) {
			sele.selectByValue(value);
		}catch(Exception e) {
			int index = Integer.parseInt(value);
			System.out.println(index);
			sele.selectByIndex(index);
			System.out.println("Click is done");
		}
	}
}