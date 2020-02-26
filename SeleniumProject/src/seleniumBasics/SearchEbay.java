package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchEbay {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); // opens browser
		driver.get("http://ebay.com");
		driver.manage().window().maximize();
		WebElement ebayTxtbox=driver.findElement(By.id("gh-ac"));
		ebayTxtbox.sendKeys("mobiles");
		driver.findElement(By.id("gh-btn")).click();
		
		// click on 3rd link from result
		driver.findElement(By.xpath("(.//img[@class='s-item__image-img'])[3]")).click();
	}

}
