package mouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverEx {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://amazon.in");
		
		WebElement accntList = driver.findElement(By.id("nav-link-accountList"));
		Actions act = new Actions(driver);
		act.moveToElement(accntList).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[text()='Baby Wish List']")).click();
	}

}
