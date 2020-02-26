package seleniumBasics;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcPage {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); // opens firefox browser
		String mainWindowHandle = driver.getWindowHandle();
		
		driver.manage().window().maximize();
		driver.get("http://irctc.co.in");
		WebElement list=driver.findElement(By.xpath(".//div[@class='h_menu_drop_button hidden-xs']"));
		list.click();
		
		//click on login button
		driver.findElement(By.xpath(".//button[text()='LOGIN']")).click();
		
		//Switch to login window
		for (String childWindowHandle : driver.getWindowHandles()) {
			  //If window handle is not main window handle then close it 
			  if(!childWindowHandle.equals(mainWindowHandle)){
				  driver = driver.switchTo().window(childWindowHandle);
			  // Close child windows
				  driver.close();
			  }
			} 
		
		//driver.findElement(By.className("(.//div[@class='ui-dialog-content ui-widget-content'])[5]"));
		WebElement userName = driver.findElement(By.xpath(".//input[@id='userId']"));
		userName.sendKeys("taalam");
		WebElement password = driver.findElement(By.xpath(".//input[@id='pwd']"));
		password.sendKeys("taalam123");
		
		//Read Captcha text from image
//		File src = driver.findElement(By.id("nlpCaptchaImg")).getScreenshotAs(OutputType.FILE);
//		String path = System.getProperty("user.dir");//+"/screenshots/captcha.png";
//		System.out.println("Path: "+path);
	}

}
