package keyboardAction;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RefreshPageEx {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.flipkart.com");
		Thread.sleep(10000);
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.LEFT_CONTROL).sendKeys(Keys.F5).keyUp(Keys.LEFT_CONTROL).perform();
	}

}
