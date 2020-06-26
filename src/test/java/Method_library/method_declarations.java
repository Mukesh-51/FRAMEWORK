
package Method_library;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class method_declarations {
	private static final boolean True = false;
	static WebDriver D;

	public void click(By eID) {

		try {
			D.findElement(eID).click();
		}

		catch (Exception e) {
			System.out.println("Exception Occured in click");
			e.printStackTrace();
		}

	}

	public void tab() {
		Actions actions = new Actions(D);
		actions.sendKeys(Keys.TAB);

	}

	public void list(By eID) {
		List<WebElement> autoSuggest = D.findElements(eID);
		try {
			Thread.sleep(3000);
			for (WebElement a : autoSuggest) {
				System.out.println("Values are = " + a.getText());
				System.out.println("1");
				if (a.getText().equalsIgnoreCase("Allied World Insurance Company"))
					;
				a.click();
				Thread.sleep(3000);
				break;
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception occured in listing");
			e.printStackTrace();
		}

		// print the auto suggest

	}

	public void downArrow() {

		Actions actions = new Actions(D);
		actions.sendKeys(Keys.DOWN);

	}

	public void enter() {
		Actions actions = new Actions(D);
		actions.sendKeys(Keys.RETURN);
	}

	public void setText(By eID, String Text) {

		try {
			D.findElement(eID).sendKeys(Text);
		}

		catch (Exception e) {
			System.out.println("Exception Occured in set text");
			e.printStackTrace();
		}
	}

	public void sleep() throws InterruptedException {
		Thread.sleep(3000);
	}

	public void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) D;
		js.executeScript("window.scrollBy(0,1000)");
	}

	public void dropDownbyText(By eID, String Text) {

		try {
			WebElement dropDown = D.findElement(eID);
			Select select = new Select(dropDown);
			select.selectByVisibleText(Text);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception Occured in Drop down by Text");
			e.printStackTrace();
		}

	}

	public void dropDownValue(By eID, String Text) {
		try {
			Select option = new Select(D.findElement(eID));
			option.selectByVisibleText(Text);
			option.selectByValue(Text);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception Occured in Drop down value");
			e.printStackTrace();
		}

	}

	public void dropDown(By eID, String Text) {
		try {
			Select option = new Select(D.findElement(eID));
			option.selectByVisibleText(Text);
			option.selectByIndex(1);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception Occured in Drop down");
			e.printStackTrace();
		}

	}

	public static String getAlphaNumericString(int n) {

		// chose a Character random from this String
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";

		// create StringBuffer size of AlphaNumericString
		StringBuilder sb = new StringBuilder(n);

		for (int i = 0; i < n; i++) {

			// generate a random number between
			// 0 to AlphaNumericString variable length
			int index = (int) (AlphaNumericString.length() * Math.random());

			// add Character one by one in end of sb
			sb.append(AlphaNumericString.charAt(index));
		}

		return sb.toString();
	}

	public String getText(By eID) {
		String s1 = null;
		try {
			s1 = D.findElement(eID).getText();
			System.out.println(s1);
		}

		catch (Exception e) {
			System.out.println("Exception Occured in get text");
			e.printStackTrace();
		}
		return s1;
	}

	public WebDriver driver_initialize(WebDriver d2) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		D = new ChromeDriver();
		D.manage().window().maximize();
		return D;
	}

	public void waitTillClickable(By eID) {
		try {
			WebElement element;
			WebDriverWait wait = new WebDriverWait(D, 100);
			element = wait.until(ExpectedConditions.elementToBeClickable(eID));
			D.findElement(eID).click();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception Occured in waitTillClickable");
			e.printStackTrace();
		}

	}

	public void click_js(By eID) {
		WebElement element = D.findElement(eID);
		((JavascriptExecutor) D).executeScript("arguments[0].click();", element);
	}

	public void click_xy(By eID) {
		WebElement element = D.findElement(eID);
		Actions actions = new Actions(D);
		actions.moveToElement(element).click().perform();
	}

	public void jsExecClick(By eID) {
		try {
			WebElement element = D.findElement(eID);
			JavascriptExecutor executor = (JavascriptExecutor) D;
			executor.executeScript("arguments[0].click();", element);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception Occured in Javascript executor");
			e.printStackTrace();
		}

	}

	public void explicitWait(By eID) {
		try {
			WebDriverWait wait = new WebDriverWait(D, 60);
			WebElement signin = wait.until(ExpectedConditions.visibilityOfElementLocated(eID));

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
