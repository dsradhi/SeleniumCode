package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextEx {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); // opens firefox browser
		driver.manage().window().maximize();
		driver.get("http://www.google.in");
		WebElement gmailLink = driver.findElement(By.linkText("Gmail"));
		gmailLink.click();
	}

}
