package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartPopup {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); // opens browser
		driver.manage().window().maximize();
		driver.get("http://flipkart.com");
		
		//driver.findElement(By.xpath(".//button[@class='_2AkmmA _29YdH8']")).click();
		WebElement email = driver.findElement(By.xpath(".//input[@class='_2zrpKA _1dBPDZ']"));
		email.sendKeys("sss@gmail.com");
	}

}
