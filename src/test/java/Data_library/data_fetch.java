

package Data_library;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;

public class data_fetch {

	public By getLocator(String strElement) throws Exception {
		
		//System.getProperty("user.dir") + "/test-output/testReport.html"

		File file = new File(System.getProperty("user.dir")+"\\src\\test\\java\\elements.properties");
		FileInputStream fileInput = new FileInputStream(file);
		Properties properties = new Properties();
		properties.load(fileInput);
		fileInput.close();

		String locatorType = properties.getProperty(strElement).split(":")[0];
		String locatorValue = properties.getProperty(strElement).split(":")[1];

		switch (locatorType) {
		case "id": {
			return By.id(locatorValue);
		}
		case "name": {
			return By.name(locatorValue);
		}
		case "classname": {
			return By.className(locatorValue);
		}
		case "tagname": {
			return By.className(locatorValue);
		}
		case "linktext": {
			return By.linkText(locatorValue);
		}
		case "cssselector": {
			return By.cssSelector(locatorValue);
		}
		default: {
			return By.xpath(locatorValue);
		}
		}
	}

}
