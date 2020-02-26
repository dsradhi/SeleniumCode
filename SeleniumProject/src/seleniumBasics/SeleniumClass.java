package seleniumBasics;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumClass {

	public static void main(String[] args) {
		/* Amazon Website
		WebDriver driver = new ChromeDriver(); // opens firefox browser
		driver.get("http://www.amazon.in");
		WebElement amazonSrchBtn=driver.findElement(By.id("twotabsearchtextbox"));
		amazonSrchBtn.sendKeys("laptops");
		driver.findElement(By.className("nav-input")).click();*/
		
		/* Youtube 
		WebDriver driver = new ChromeDriver(); // opens firefox browser
		driver.get("http://youtube.com");
		WebElement amazonSrchBtn=driver.findElement(By.id("search"));
		amazonSrchBtn.sendKeys("srimantudu songs");
		driver.findElement(By.id("search-icon-legacy")).click();
		// sarileru song driver.findElement(By.xpath("(.//a[@class='yt-simple-endpoint inline-block style-scope ytd-thumbnail'])[2]")).click();
		driver.findElement(By.xpath("(.//a[@class='yt-simple-endpoint inline-block style-scope ytd-thumbnail'])[10]")).click();
		
		/*WebDriver driver=new ChromeDriver();
		driver.get("http://www.youtube.com");
		
		WebElement txtBoxSearch=driver.findElement(By.id("search"));
		txtBoxSearch.sendKeys("vijay Devarakonda");
		
		WebElement search=driver.findElement(By.xpath("(.//yt-icon[@class='style-scope ytd-searchbox'])[1]"));
		search.click();
		
		WebElement wb=driver.findElement(By.xpath("(.//yt-formatted-string[@class='style-scope ytd-video-renderer'])[1]"));
		wb.click();*/
	}

}
