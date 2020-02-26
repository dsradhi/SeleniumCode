package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DisplayMobPriceList {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
	  driver.get("https://www.flipkart.com/search?q=mobiles&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off"); 
	  List<WebElement> mobList = driver.findElements(By.className("_3wU53n"));
	  List<WebElement> priceList =
	  driver.findElements(By.xpath(".//*[@class='_1vC4OE _2rQ-NK']"));
	  System.out.println("List of Mobiles:"+mobList.size()); for(int
	  i=0;i<mobList.size();i++) { System.out.println(mobList.get(i).getText());
	  System.out.println(priceList.get(i).getText()); }
		 

		/*Amazon.in
		driver.get("https://www.amazon.in/s?k=mobiles&ref=nb_sb_noss_2");
		List<WebElement> mobList = driver.findElements(By.className("s-image"));
		System.out.println("List of Mobiles:"+mobList.size());
		*/
	}

}
