package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchByText {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.youtube.com");
		
		WebElement txtBoxSearch=driver.findElement(By.id("search"));
		txtBoxSearch.sendKeys("vijay Devarakonda");
		
		WebElement search=driver.findElement(By.xpath("(.//yt-icon[@class='style-scope ytd-searchbox'])[1]"));
		search.click();
		
		WebElement wb=driver.findElement(By.xpath("(.//yt-formatted-string[@class='style-scope ytd-video-renderer'])[1]"));
		wb.click();
		
		/* Youtube 
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("http://youtube.com");
		WebElement youtubeSrchBtn=driver.findElement(By.id("search"));
		youtubeSrchBtn.sendKeys("butta bomma");
		driver.findElement(By.xpath(".//button[@id='search-icon-legacy']")).click();
		
		driver.findElement(By.xpath("(.//a[@id='video-title'])[2]")).click();
		//play 2nd song from sarileru
		//driver.findElement(By.xpath("(.//a[@id='thumbnail'])[2]")).click();
		
		/*play Ramulodu vachinaduro from Srimantudu
		 * driver.findElement(By.xpath("(.//a[@class='yt-simple-endpoint inline-block style-scope ytd-thumbnail'])[10]")).click();
		 */
		
		/* Amazon Website
		WebDriver driver = new ChromeDriver(); // opens firefox browser
		driver.get("http://www.amazon.in");
		WebElement amazonSrchBtn=driver.findElement(By.id("twotabsearchtextbox"));
		amazonSrchBtn.sendKeys("laptops");
		driver.findElement(By.className("nav-input")).click();*/
	}

}
